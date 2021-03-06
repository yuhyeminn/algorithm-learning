package algorithm.sort;

import java.util.Arrays;

/**
 * 선택정렬(Selection Sort)
 * - 가장 작은 것을 선택해서 제일 앞으로 보내는 정렬 알고리즘
 * - 시간복잡도 : O(N^2)
 */
public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		//오름차순 정렬
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		System.out.println("result : " + Arrays.toString(s.sort(arr)));
	}
	
	public int[] sort(int[] arr) {
		int index = 0;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		return arr;
	}
}
