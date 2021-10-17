package test5;
import java.util.Scanner;
public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount:");
		double amount = input.nextDouble();
		System.out.print("Number Of Years:");
		int year = input.nextInt();
		double rate = 5;
		System.out.println("Interest Rate  Monthly Payment  Total Payment");
		for (rate=5;rate<=8;rate=rate+0.125) {
			System.out.printf("%.3f",rate);
			System.out.print("%         ");
			double monthrate = rate/1200;
			double monthlypayment = amount*monthrate/(1-1/Math.pow(1+monthrate, year*12));
			double totalpayment = monthlypayment * year * 12;
			System.out.printf("%.2f",monthlypayment);
			System.out.print("           ");
			System.out.printf("%.2f",totalpayment);
			System.out.print("\n");
		}
	}

}
