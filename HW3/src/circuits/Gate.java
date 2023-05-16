package circuits;

public abstract class Gate {
	protected Gate[] inGates;
	public Gate(Gate[] inGates) {
		this.inGates = inGates;
	}
	public boolean calc() throws CircuitException{		
		boolean[] loogicGates = null;
		if(inGates != null) {
			loogicGates = new boolean[inGates.length];
			for(int i = 0; i<inGates.length;i++ ) {
				if(inGates[i] == null)
						throw new CircuitException();
				loogicGates[i] = this.inGates[i].calc();
				}
			
				
		}
		return func(loogicGates);
		
		
	}
	protected abstract boolean func(boolean[] inValues) throws CircuitException;
	public abstract String getName();
	public abstract Gate simplify();
	
	public String toString() {
			StringBuilder str = new StringBuilder();
			if(this.inGates == null)
				return this.getName();
			str.append(this.getName());
			str.append("[");
			for(int i = 0 ; (i < inGates.length)&&(this.inGates[i] != null);i++) {
				str.append(this.inGates[i]);
				str.append(", ");
			}
			if(inGates!= null && inGates.length>=1)
				str.delete(str.length()-2,str.length());

			str.append("]");
			return str.toString();
	}
}
