import java.util.*;

public class Guvi11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Enter the power of the number");
		int b=sc.nextInt();
		int c=1;
		for(int i=1;i<=b;i++) {
			c=c*a;
		}
		System.out.println(c);
		

	}

}
