package test5;
import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        int i,j,k,l;
        for (i=1;i<=n;i++) {
        	for (j=2*i;j<=2*(n);j++) {
        		System.out.print(" ");
        	}
        	for (k=i;k>=1;k--) {
        		System.out.print(k);
        		System.out.print(" ");
        	}
        	for (l=2;l<=i;l++) {
        		System.out.print(l);
        		System.out.print(" ");
        	}
        	System.out.print("\n");
        }
	}

}
