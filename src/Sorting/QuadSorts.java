package Sorting;

public class QuadSorts {
	
	

	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < (arr.length - 1); i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minValue = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minValue]) {
					minValue = j;
				}
			}
			if(minValue != i) {
				int temp = arr[minValue];
				arr[minValue] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	public static int[] insertionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int split = arr[i];
			int j = i - 1;
			while(arr[j] > split && j <= 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j = 1] = split;
		}
		return arr;
	}

}
