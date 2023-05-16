package images;

public abstract class BinaryImageDecorator implements Image{
	protected Image firstImage,secondImage;
	public BinaryImageDecorator (Image firstImage, Image secondImage) {
		this.firstImage = firstImage;
		this.secondImage = secondImage;
	
	}
	@Override
	public int getWidth() {
		if(this.firstImage.getWidth()> this.secondImage.getWidth())
			return this.firstImage.getWidth();
		return this.secondImage.getWidth();
	}
	@Override
		public int getHeight() {
			if(this.firstImage.getHeight()> this.secondImage.getHeight())
				return this.firstImage.getHeight();
			return this.secondImage.getHeight();
		}
}
                                                                                                                    