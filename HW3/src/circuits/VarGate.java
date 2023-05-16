package circuits;

public class VarGate extends Gate{
	private String name;
	private Boolean value;
	public VarGate(String name) {
		super(null);
		this.name = name;
	
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		if(value == null)
			throw new CircuitException();
		return this.value;
	}

	@Override
	public String getName() {
		return "V" + this.name;
	}

	@Override
	public Gate simplify() {
		if(value == null)
			return this;
		if(value == true)
			return TrueGate.instance();
		if(value == false) {
			return FalseGate.instance();
			
		}
		return this;
	}
	public void setVal(boolean value) {
		this.value = value;
	}

}
