package Sorting;
import java.util.Scanner;
public class sortingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] bubbleArray = new int[n];
		int[] selectionArray = new int[n];
		int[] insertionArray = new int[n];
		int[] mergeArray = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * n);
		}
		System.out.print("Original Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		int[] array4 = array.clone();
		bubbleArray = QuadSorts.bubbleSort(array);
		selectionArray = QuadSorts.selectionSort(array2);
		insertionArray = QuadSorts.selectionSort(array3);
		MergeSort sorter = new MergeSort();
        sorter.sort(array);
		System.out.print("\nBubble Sort: ");
		for(int i = 0; i < n; i++) {
			System.out.print(bubbleArray[i] + ", ");
		}
		System.out.print("\nSelection Sort: ");
		for(int i = 0; i < n; i++) {
			System.out.print(selectionArray[i] + ", ");
		}
		System.out.print("\nInsertion Sort: ");
		for(int i = 0; i < n; i++) {
			System.out.print(insertionArray[i] + ", ");
		}
		System.out.print("\nMerge Sort: ");
		// I couldn't figure out how to do mergeSort in the same class as the others. (More like I didn't want to)
        
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
		
	}
}
