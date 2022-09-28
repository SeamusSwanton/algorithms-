
public class IterativeSearcher {

	public int doBinarySearch(IntegerArray arrayToSort, int i) {
		int low = 0;
		int high = arrayToSort.length();
		
		int output = -1;
		
		while(high > 2){
			
			int mid = (high + low)/2;
			
			if (i == arrayToSort.read(mid)) {
				output = arrayToSort.read(mid);
				return output;
			}
			else if(i == high || i == arrayToSort.read(0)){
				if(i == high) {
					return high;
				}
				else {
					return low;
				}
			}
			else {
				high = 0;
			}
			
		}
		return output;
	}


}
