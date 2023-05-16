package images;

public abstract class ImageDecorator implements Image {
	private Image image;
	public ImageDecorator(Image image) {
		this.image = image;
	}
	
	protected Image getImage() {
		return this.image;
	}
	@Override
	public int getWidth() {
		return image.getWidth();
	}
	@Override
	public int getHeight() {
		return image.getHeight();
	}

}
