package com.sorting;

public class SelectionSortI {
	
	public static void sort(Comparable[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			//initialize minIndex to the first index of the unsorted array 
			int minIndex = i;
			for (int j = i + 1; j < n; j ++) {
				if ((arr[minIndex]).compareTo(arr[j])>0) {
					minIndex = j;
				}
			}
			swap (arr,i,minIndex);
		}
	}
	
	public static void swap(Object[] arr, int i, int j) {
	       Object temp = arr[j];
	       arr[j] = arr[i];
	       arr[i] = temp;
	}
	
	public static void main(String[] args) {
		Integer intArray[] = {2,11,92,34,32,0,1,9};
		sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		Double doubleArray[] = {4.5, 6.7, 3.2, 1.0, 2.8, 5.3};
		sort(doubleArray);
		for(int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
        String[] c = {"D", "C", "B", "A"};
        sort(c);
        for( int i = 0 ; i < c.length ; i ++ ){
            System.out.print(c[i]);
            System.out.print(' ');
        }
        System.out.println();
	}
}
