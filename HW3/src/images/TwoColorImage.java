package images;

public class TwoColorImage  extends BaseImage{
	private RGB zero,one;
	TwoDFunc func;
	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func)
 {
		super(width, height);
		this.zero = zero;
		this.one = one;
		this.func = func;
		
	}

	@Override
	public RGB get(int x, int y) {//Normalize x and y and send to f
		double alpha = func.f((double) x/super.getWidth(), (double) y/super.getHeight());
		if(alpha >= 1)
			alpha = 1;
		if(alpha<=0)
			alpha = 0;
		return RGB.mix(one, zero, alpha);
	}

}
