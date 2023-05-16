package images;

public class Mix  extends BinaryImageDecorator {
	double alpha;
	public Mix(Image base1, Image base2, double alpha) 
	{
		super(base1,base2);
		this.alpha = alpha;
	}

	@Override
	public RGB get(int x, int y) {
		//if both are defined
		if(((x <= firstImage.getWidth() )&& (y <= firstImage.getHeight()))&& ((x <= secondImage.getWidth() )&& (y <= secondImage.getHeight())))
			return RGB.mix(firstImage.get(x, y), secondImage.get(x, y),alpha);
		//if the first image is defined
		if (x <= firstImage.getWidth() && y <= firstImage.getHeight())
			return firstImage.get(x, y);
		//if second image is defined
		if (x <= secondImage.getWidth() && y <= secondImage.getHeight())
			return secondImage.get(x, y);
		//if none are defined
			return RGB.BLACK;
		
		
	}

}
