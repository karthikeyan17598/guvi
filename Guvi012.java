import java.util.Scanner;

public class Guvi012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			a=n%10;
			c=(c*10)+a;
			n=n/10;
		}
		if(temp==c) {
			System.out.println("Yes");
		}
		else
		{
		System.out.println("No");
		}

	}

}
