      
package guviproblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Guvi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,2,3,4,2,3};
        int count = 0;
        Arrays.sort(arr);
        ArrayList<Integer> ss=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length-1;i++) {
         count = 0;
        for(int j=1;j<arr.length-1;j++) {
        	if(arr[i]==arr[j]) {
        		ss.add(arr[i]);
        	} 

    		}
        }
        HashSet sk=new HashSet(ss);
                   System.out.println(sk);
	}

}
