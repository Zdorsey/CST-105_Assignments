import java.util.Scanner;
public class Exercise20 
{

	public static void main(String[] args) 
	{
		//creates the scanner
		Scanner input = new Scanner(System.in);
		//prompt to enter balance and puts it as a variable
		System.out.print("Enter the balance: ");
		double balance = input.nextDouble();
		//prompts to enter annual interest rate and sets as a variable
		System.out.print("Enter the annual interest rate: ");
		double annual_interest_rate = input.nextDouble();
		//calculates the monthly interest
		double interest = balance * (annual_interest_rate / 1200);
		System.out.print("The interest is: " + interest);
		
	}

}
