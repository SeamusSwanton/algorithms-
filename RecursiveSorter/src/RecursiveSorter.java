public class RecursiveSorter {
	
	public void doQuickSort(IntegerArray clone) {
		int leftIndex = 0;
		int rightIndex = clone.length()-1;
		
		doQuickSort(clone, leftIndex, rightIndex);
		
		
	}
	public void doQuickSort(IntegerArray clone, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex){
			
			
			int partition = partition(clone, leftIndex, rightIndex);
			
			doQuickSort(clone, leftIndex, partition);			
			doQuickSort(clone, partition + 1, rightIndex);
		}
	}
	
	static int partition(IntegerArray clone, int leftIndex, int rightIndex) {
		
		
		int pivot = clone.read(rightIndex);
		
		int i = (leftIndex - 1);
		  
        for (int j = leftIndex; j <= rightIndex - 1; j++) {
        	if (clone.read(j) < pivot) {
        		
        		i++;
        		swap(clone, i, j);
        	}
        }
		return 0;
	}
	
	static void swap(IntegerArray clone, int i, int j) {
		
	}
	

	public void doMergeSort(IntegerArray array) {
		int leftIndex = 0;
		int rightIndex = array.length()-1;
		
		doMergeSort(array, leftIndex, rightIndex);
	}
	
	public void merge(IntegerArray array, int leftIndex, int mid, int rightIndex) {
		int[] output = new int[array.length()];
		

		int n1 = mid - leftIndex + 1;    
		int n2 = rightIndex - mid; 

		int tempArrayLeft[] = new int[n1];
		int tempArrayRight[] = new int[n2];


		for (int i = 0; i <n1; i++) {
			tempArrayLeft[i] = array.read(leftIndex + i);
		}
		for (int i = 0; i <n2; i++) {
			tempArrayRight[i]= array.read(mid + i + 1 );
		}

		int a = 0, b = 0; 
		int k = leftIndex;
		
		while (a < n1 && b < n2) {

			if (tempArrayLeft[a] <=  tempArrayRight[b]) {
				array.write(k, tempArrayLeft[a]);
				a++;
			}
			else {
				array.write(k, tempArrayRight[b]);
				b++;
			}
			k++;
		}
		while (a < n1) {
			array.write(k, tempArrayLeft[a]);
            a++;
            k++;
		}
		while (b < n2) {
			array.write(k, tempArrayRight[b]);
            b++;
            k++;
        }

		
	}
	
	
	public void doMergeSort(IntegerArray array, int leftIndex, int rightIndex) {	
		if (leftIndex < rightIndex){
			int mid = (leftIndex + (rightIndex ))/2;
			
			doMergeSort(array, leftIndex, mid);			
			doMergeSort(array, mid + 1, rightIndex);
			merge(array, leftIndex, mid, rightIndex);
		}
		
	}

}
