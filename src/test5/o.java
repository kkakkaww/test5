package test5;
import java.util.Scanner;
public class o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		double d0 = input.nextDouble();
		double d1 = input.nextDouble();
		double d2 = input.nextDouble();
		double d3 = input.nextDouble();
		double d4 = input.nextDouble();
		double d5 = input.nextDouble();
		double d6 = input.nextDouble();
		double d7 = input.nextDouble();
		double d8 = input.nextDouble();
		double d9 = input.nextDouble();
		double mean = (d0+d1+d2+d3+d4+d5+d6+d7+d8+d9)/10;
		double a = Math.pow(d0, 2)+Math.pow(d1, 2)+Math.pow(d2, 2)+Math.pow(d3, 2)+Math.pow(d4, 2)+Math.pow(d5, 2)+Math.pow(d6, 2)+Math.pow(d7, 2)+Math.pow(d8, 2)+Math.pow(d9, 2);
		double b = Math.pow(mean*10, 2)/10;
		double sd = Math.sqrt((a-b)/9);
		System.out.println("The mean is "+mean);
		System.out.print("The standard deviation is ");
		System.out.printf("%.5f", sd);
	}

}
