public class RecursiveSorter {
	
	public void doQuickSort(IntegerArray clone) {
		
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
			tempArrayLeft[i] = (leftIndex + i);
		}
		for (int i = 0; i <n2; i++) {
			tempArrayRight[i]= (rightIndex + i);
		}

		int a = 0, b = 0; 
		int k = leftIndex;
		while (a < n1 && b < n2) {

			if (tempArrayLeft[a] <=  tempArrayRight[b]) {
				array.write(k, tempArrayLeft[a]);
				a++;
			}
			else {
				array.write(k, tempArrayLeft[b]);
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
			array.write(k, tempArrayLeft[b]);
            b++;
            k++;
        }

		
	}
	
	
	public void doMergeSort(IntegerArray array, int leftIndex, int rightIndex) {	
		if (leftIndex < rightIndex){
			int mid = (leftIndex + rightIndex)/2;
			
			doMergeSort(array, leftIndex, mid);			
			doMergeSort(array, mid + 1, rightIndex);
			merge(array, leftIndex, mid, rightIndex);
		}
		
	}

}
