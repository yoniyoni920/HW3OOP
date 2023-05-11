package Classes;



public class  MyArray implements MyIterator {
	private int[] arr;
	private int i=0;
	public MyArray(int[] arr) {
		this.arr = arr;
	}
	
	
	@Override
	public boolean hasNext() {
		if((i+1) <= this.arr.length)
			return true;
		return false;
	}
	public int next() {

			return this.arr[i++];
		

	

	
}
}
