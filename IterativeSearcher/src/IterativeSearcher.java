

	public class IterativeSearcher {

		public int doBinarySearch(IntegerArray arrayToSort, int i) {

			int index = -1;
			int start = 0;
			int end = arrayToSort.length() - 1;
			int mid = (end - start)/2;

			while ((end - start) > 1)
			{
				if (arrayToSort.read(mid) < i)
				{
					start = mid;
					mid = mid + (end - start)/2;
				}
				else
				{
					end = mid;
					mid = mid - (end - start)/2;
				}
			}

			if (arrayToSort.read(start) == i)
			{
				index = start;
			}
			else if (arrayToSort.read(end) == i)
			{
				index = end;
			}

			return index;
		}

	}

}
