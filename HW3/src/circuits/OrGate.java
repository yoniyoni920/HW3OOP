package circuits;

public class OrGate extends Gate {

	public OrGate(Gate[] inGates) {
		super(inGates);
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		for(Boolean Value: inValues)
			if(Value == true)
				return true;
		return false;
	}

	@Override
	public String getName() {

		return "OR";
	}

	@Override
	public Gate simplify() {
		Gate[] temp = null;

		int cnt =0;
		int j=0;
		for(Gate gate: inGates)
			if(gate == TrueGate.instance())
				return TrueGate.instance();
			else {
				for(int i = 0; i < this.inGates.length; i ++) {// ignore false gates count the other gates amount amount
						if(this.inGates[i].simplify()!=FalseGate.instance()) {
							cnt++;
						}
				}

				temp = new Gate[cnt];
				for(int i = 0; i < this.inGates.length; i ++) {//adds the other gates to new array
					if(this.inGates[i].simplify() != FalseGate.instance()) {
						temp[j++] = this.inGates[i].simplify();
						}
					}
				if(cnt>1){//need to check after simplify for true gates we should i
					return new OrGate(temp);	
				}
				if(cnt == 1)//return simplify of last gate if there's only one left
					return temp[0].simplify();
				if(cnt == 0)
					return FalseGate.instance();
				
					
			}
		return null;
	}
}
