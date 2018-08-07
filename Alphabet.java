package beginner;

import java.util.Scanner;

public class Alphabet {

	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("the given input is alphabet");
		}
		else {
			System.out.println("not a alphabet");
			
		}
		
    }

			
		}


