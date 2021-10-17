package test5;
import java.util.Scanner;
public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit1 = (int)(Math.random()*10);
		int digit2 = (int)(Math.random()*10);
		while(digit1 == digit2) {
			digit2 = (int)(Math.random()*10);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		int guessdigit1 = guess / 10;
		int guessdigit2 = guess % 10;
		
		System.out.println("The lottery number is " + (digit1*10+digit2));
		
		if(guess==digit1*10+digit2) 
			System.out.println("Exact match: you win $10,000");
		else if(guessdigit1==digit2&&guessdigit2==digit1)
			System.out.println("Match all digits: you win $3,000");
		else if(guessdigit1==digit2||guessdigit1==digit1||guessdigit2==digit2||guessdigit2==digit1)
			System.out.println("Match all digits: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}

}
