package Classes;

public class runner {

	public static void main(String[] args) {
		int[] x = {2, 4, 6, 1};
		MyIterator it = new MyArray(x);
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.print(it.next() + "");
	}

}
