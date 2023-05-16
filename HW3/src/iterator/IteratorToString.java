package iterator;
public class IteratorToString {
	
	public static String toString(MyIterator it) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		while(it.hasNext()) {
			str.append(it.next()+" ");
		}
		str.delete(str.length()-1, str.length());
		str.append("]");
		return str.toString();
	}

}
