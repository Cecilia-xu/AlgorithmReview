package com.sorting;
/*
 *@author:Cecilia
 *@date:03/20/2019 
 */

public class SelectionSort {
	
	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			//initialize minIndex to the first index of the unsorted array 
			int minIndex = i;
			////find the index of the minimum value in the unsorted part. Note! Range! [0,i] sorted [i,n] unsorted
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			swap(arr,i,minIndex);	
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {7,5,3,4,8,12,1,0};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(' ');
		}
	}

}
