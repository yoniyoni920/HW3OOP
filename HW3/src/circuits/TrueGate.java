package circuits;

public class TrueGate extends Gate{
	private static TrueGate instance = null;
	private TrueGate() {
		super(null);
	}

	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {
		return true;
	}

	@Override
	public String getName() {
		return "T";
	}

	@Override
	public Gate simplify() {
		return instance;
	}
	public static Gate instance() {
		if(instance == null)
			instance = new TrueGate();
		return instance;
		
	}
	

}
