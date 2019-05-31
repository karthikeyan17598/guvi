import java.util.Scanner;

public class Guvi14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=a;i<=b;i++) {
			
			if(i%2==1) {
				c=i;
				System.out.println(c);
				
			}
		}

	}

}
