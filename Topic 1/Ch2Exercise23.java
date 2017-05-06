import java.util.Scanner;
public class Exercise23 
{

	public static void main(String[] args) 
	{
		//Creates a scanner
		Scanner input = new Scanner(System.in);
		//Prompts you to enter miles per gallon, price per gallon, and driving distance
		System.out.print("Enter The Driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double miles_per_gallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double price_per_gallon = input.nextDouble();
		//Calculating gallons per mile and cost for drive
		double gallon_per_mile = distance / miles_per_gallon;
		double cost = gallon_per_mile * price_per_gallon;
		//Displaying answer
		System.out.print("The total cost for the trip is: $" + (int)(cost * 100.0) / 100.0);
	}

}
