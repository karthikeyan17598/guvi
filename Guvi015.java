import java.util.Scanner;

public class Guvi015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=a;i<b;i++) {
			
			if(i%2==0) {
				c=i;
				System.out.println(c);
				
			}
		}

	}

}
