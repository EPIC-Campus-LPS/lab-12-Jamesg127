package Sorting;

public class MergeSort {
	 public void sort(int[] arr) {
	        mergeSort(arr, 0, arr.length - 1);
	    }
	    private void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int medium = low + (high - low) / 2;
	            mergeSort(arr, low, medium);
	            mergeSort(arr, medium + 1, high);
	            merge(arr, low, medium, high);
	        }
	    }

	    // Merges two sorted subarrays into a single sorted array
	    private void merge(int[] arr, int low, int mid, int high) {
	        // Create temporary arrays to hold the left and right halves
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Copy data to temporary arrays
	        for (int i = 0; i < n1; i++) {
	            leftArray[i] = arr[low + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            rightArray[j] = arr[mid + 1 + j];
	        }
	        int i = 0, j = 0; // Pointers for leftArray and rightArray
	        int k = low;    // Pointer for original array
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }
	        // Copy remaining elements of rightArray, if any
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	   }
}
