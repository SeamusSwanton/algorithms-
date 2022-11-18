public class RecursiveSorter {
	
	public void doQuickSort(IntegerArray clone) {
		
	}

	public void doMergeSort(IntegerArray array) {
		int leftIndex = 0;
		int rightIndex = array.length() - 1;
		
		doMergeSort(array, leftIndex, rightIndex);
	}
	
	public void merge(IntegerArray array, int leftIndex,int mid, int rightIndex) {
		int[] output = new int[0];
		
		int i, j, k;  
	    int n1 = mid - leftIndex + 1;    
	    int n2 = rightIndex - mid;  
	}
	
	
	public void doMergeSort(IntegerArray array, int leftIndex, int rightIndex) {	
		if (leftIndex < rightIndex){
			int mid = (leftIndex + rightIndex)/2;
			
			doMergeSort(array, leftIndex, mid);			
			doMergeSort(array, mid, rightIndex);
			merge(array, leftIndex, mid, rightIndex);
		}
		
	}

}
