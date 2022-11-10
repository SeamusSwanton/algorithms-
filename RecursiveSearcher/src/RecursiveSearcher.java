
public class RecursiveSearcher {
	int low;
	int high;
	int mid = 0;
	
	private int doBinarySearch(IntegerArray arrayOfInts, int target, int low, int high) {
		mid = (high + low)/2;
		
		int midValue = arrayOfInts.read(mid);
		
		return target;
	}
	
	public int doBinarySearch(IntegerArray arrayOfInts, int target) {
		low = 0;
		high = arrayOfInts.length()-1;

		return doBinarySearch(arrayOfInts, target, low, high);
	}
}
