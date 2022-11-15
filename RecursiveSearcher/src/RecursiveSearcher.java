
public class RecursiveSearcher {
	int low;
	int high;
	int mid = 0;
	int output = -1;

	private int doBinarySearch(IntegerArray arrayOfInts, int target, int low, int high) {
		if (low <= high) {
			mid = (high + low)/2;

			int midValue = arrayOfInts.read(mid);

			if(midValue == target) {
				if (mid == low || mid == high) {
					output = mid;
				}
				if (target == arrayOfInts.read(mid-1)) {
					high = mid;
					doBinarySearch(arrayOfInts, target, low, high);
				}
				output = mid;

			}
			else if (midValue < target) {
				low = mid + 1;
				doBinarySearch(arrayOfInts, target, low, high);
			}
			else if (midValue > target) {
				high = mid - 1;
				doBinarySearch(arrayOfInts, target, low, high);
			}
			else {
				output = -1;
			}

			return output;
		}
		else {
			return -1;
		}
			
		}
	
	
	public int doBinarySearch(IntegerArray arrayOfInts, int target) {
		low = 0;
		high = arrayOfInts.length()-1;

		if (target == arrayOfInts.read(low)) {
			return low;
		}
		else if (target == arrayOfInts.read(high)) {
			return high;
		}
		else {
			if (low <= high) {
				return doBinarySearch(arrayOfInts, target, low, high);
			}
			else {
				return -1;
			}
		}
	}
}
