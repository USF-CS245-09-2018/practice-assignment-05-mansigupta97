public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	public void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}

	}

	public int partition(int[] arr, int left, int right) {
		if(left >= right) {
			return left;
		}
		
		int pivot = left;
		int leftIndex = left + 1;
		int rightIndex = right;

		while(leftIndex < rightIndex) {
			while(leftIndex <= right && arr[leftIndex] <= arr[pivot]) {
				leftIndex++;
			}
			while(leftIndex <= rightIndex && arr[rightIndex] > arr[pivot]) {
				rightIndex--;
			}
			if(leftIndex <= right && leftIndex < rightIndex) {
				swap(arr, leftIndex, rightIndex);
			}
		}

		swap(arr, pivot, rightIndex);
		return rightIndex;
	}

	public void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
