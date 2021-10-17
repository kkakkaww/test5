package test5;
import java.util.Scanner;
public class n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int i,j,t=0,sum=0;
		for (i=0;i<n;i++) {
			if(Math.pow(8, i)>n)
				break;
		}
		for(j=i;j>=1;j--) {
			if(Math.pow(8, j)>n&&Math.pow(8, j-1)<=n) {
				t=n/(int)Math.pow(8, j-1);
				n=n-(int)Math.pow(8, j-1);
			}
			else
				t=0;
			sum=sum*10+t;
		}
		System.out.println(sum);
	}

}
