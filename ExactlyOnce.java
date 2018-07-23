package guviproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ExactlyOnce {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  size of the number:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the number");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
			ArrayList<Integer> kk=new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++){
				kk.add(arr[i]);
			}Collections.reverse(kk);
			LinkedHashSet<Integer> k=new LinkedHashSet<Integer>(kk);
		System.out.println(k);
		}
		}
	


