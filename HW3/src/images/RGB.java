package images;

public class RGB {
	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);	
	
	private double red,green,blue;
	
	public RGB(double red, double green, double blue) {
		this.blue = blue;
		this.green = green;
		this.red = red;
	}
	public RGB(double grey) {
		this.blue = grey;
		this.green = grey;
		this.red = grey;
	}
	public double getGreen() {
		return green;
	}
	public double getRed() {
		return red;
	}
	public double getBlue() {
		return blue;
	}
	public RGB invert() {
		return new RGB(1 - this.red,1 - this.green,1 - this.blue);
	}
	
	
	public RGB filter(RGB filter) {
		return new RGB(this.red*filter.getRed(),this.green*filter.getGreen(),this.blue*filter.getBlue());
	}
	public static RGB superpose(RGB rgb1, RGB rgb2) {
		double newRed,newBlue,newGreen;

			newBlue = rgb1.getBlue()+rgb2.getBlue();
			newRed = rgb1.getRed()+rgb2.getRed();
			newGreen = rgb1.getGreen()+rgb2.getGreen();
			if(newBlue>1)
				newBlue = 1;
			if(newRed>1)
				newRed = 1;
			if(newGreen>1)
				newGreen = 1;
			return new RGB(newRed,newGreen,newBlue);
	}
	public static RGB mix(RGB rgb1, RGB rgb2, double alpha) {
		double newRed,newBlue,newGreen;
		newBlue = alpha*rgb1.getBlue()+(1-alpha) *rgb2.getBlue();
		newRed = alpha*rgb1.getRed()+(1-alpha) *rgb2.getRed();
		newGreen = alpha*rgb1.getGreen()+(1-alpha) *rgb2.getGreen();
		return new RGB(newRed,newGreen,newBlue);		
	}
	public String toString() {
		String blue = String.format("%.4g%n", this.getBlue());
		String red =  String.format("%.4g%n", this.getRed());
		String green =  String.format("%.4g%n", this.getGreen());
		
		return "<"+blue+" ,"+green+" ,"+red+">";
	}
}


































