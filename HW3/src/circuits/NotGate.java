package circuits;

public class NotGate extends Gate{

	public NotGate(Gate in) {
		super(null);
		Gate[] arr = new Gate[1];
		arr[0] = in;
		this.inGates=arr;
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
			if(inValues[0] == false)
				return true;
		return false;
	}

	@Override
	public String getName() {

		return "NOT";
	}

	@Override
	public Gate simplify() {
		if(this.inGates[0] == TrueGate.instance())
			return FalseGate.instance();
		if(this.inGates[0] == FalseGate.instance())
			return TrueGate.instance();
		if(inGates[0] instanceof NotGate)
			return inGates[0].inGates[0];
		return this;
	}
}
