package images;

public abstract class BaseImage implements Image{
	int width,height;
	public BaseImage (int width,int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public int getWidth() {
		return width;
	}
	@Override
	public int getHeight() {
		return height;
	}
}
