package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		int arr[]= {9,5,6,7,8,-1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);	
		}
		System.out.println(arr[arr.length-1]);
		
	}

}
