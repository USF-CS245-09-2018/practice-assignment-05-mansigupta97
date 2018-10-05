public class MergeSort implements SortingAlgorithm {

	public void merge(int[] arr, int[] temp, int left, int mid, int right) {
		int i = left;
		int leftIndex = left;
		int rightIndex = mid + 1;

		while(i <= right) {
			if(leftIndex > mid) {
				temp[i] = arr[rightIndex];
				i++;
				rightIndex++;
			}
			else if(rightIndex > right) {
				temp[i] = arr[leftIndex];
				i++;
				leftIndex++;
			}
			else if(arr[leftIndex] < arr[rightIndex]) {
				temp[i] = arr[leftIndex];
				i++;
				leftIndex++;	
			}
			else {
				temp[i] = arr[rightIndex];
				i++;
				rightIndex++;
			}
		}
		for(int j = left; j <= right; j++) {
			arr[j] = temp[j];
		}
	}

	public void mergeSort(int[] arr, int[] temp, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int mid = (left + right)/ 2;

		mergeSort(arr, temp, left, mid);
		mergeSort(arr, temp, mid + 1, right);
		merge(arr, temp, left, mid, right); 
	}

	public void sort(int[] a) {
		mergeSort(a, new int[a.length], 0, a.length - 1);
	}
}