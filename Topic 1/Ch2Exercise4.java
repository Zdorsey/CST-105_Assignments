import java.util.Scanner;
public class Exercise4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter amount of pounds in double, e.g, 10.5: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.print(pounds + " pounds is equal to " + kilograms + " kilograms");
	}

}
