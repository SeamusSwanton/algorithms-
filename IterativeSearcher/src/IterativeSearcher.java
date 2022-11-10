
public class IterativeSearcher {

	public int doBinarySearch(IntegerArray arrayToSort, int i) {
		int low = 0;
		int high = arrayToSort.length()-1;
		int mid = 0;
		
		
		while(low <= high){			
			mid = (high + low)/2;
			
			int midValue = arrayToSort.read(mid);
			
						
			if (midValue == i) {	
				if (mid == low || mid == high) {
					return mid;
				}
				if (i == arrayToSort.read(mid-1)) {
					high = mid;
					continue;
				}
				return mid;
			}		
									
			if (midValue < i) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
			
		}
		return -1;
		
	}


}
