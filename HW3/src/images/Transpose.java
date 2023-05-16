package images;

public class Transpose extends ImageDecorator {
		
		public Transpose(Image base) {
			super(base);

		}
		
		@Override
		public RGB get(int x, int y) {	
			
			return super.getImage().get(y, x);
		}
		@Override
		public int getWidth() {
			return super.getHeight();
		}
		@Override
		public int getHeight() {
			return super.getWidth();
		}
}
