public class InsertionSort implements SortingAlgorithm {
	
	public void sort(int [] array) {
		int temp_var;
		for(int i = 1; i < array.length; i++) {
			int j = i - 1;
			temp_var = array[i];
			while(j >= 0 && array[j] > temp_var) {
				array[j + 1] = array[j];
				j--;
			}
			array[j+1] = temp_var;
		}
	}
}