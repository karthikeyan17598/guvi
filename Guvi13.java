import java.util.Scanner;

public class Guvi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int k = sc.nextInt();
		
		for(int i=1;i<=k;i++) {
			if(k%i==0) {
				count++;
			}
		}
		
			if (count==2) {
				System.out.println(" yes");
			}
			else {
			System.out.println("No");
			}
		}
	}
		
