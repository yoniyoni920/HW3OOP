package images;

public class Superpose extends BinaryImageDecorator{
	public Superpose(Image base1, Image base2) {
		super(base1,base2);
	}

	@Override
	public RGB get(int x, int y) {
		//if both are defined
		if(((x <= firstImage.getWidth() )&& (y <= firstImage.getHeight()))&& ((x <= secondImage.getWidth() )&& (y <= secondImage.getHeight())))
			return RGB.superpose(firstImage.get(x, y), secondImage.get(x, y));
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
