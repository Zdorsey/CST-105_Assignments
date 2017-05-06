import java.util.Scanner;
public class Exercise2 
{

	public static void main(String[] args) 
	{
		// Enter first point
		System.out.print("enter point 1 (latitude and longitude) in degrees: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		//Enter second point
		System.out.print("enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Prepares numbers for calculation
		double radius = 6371.01;
		double X1 = Math.toRadians(x1);
		double Y1 = Math.toRadians(y1);
		double X2 = Math.toRadians(x2);
		double Y2 = Math.toRadians(y2);
		//Calculates and gives result
		double distance = radius * Math.acos(Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2) * Math.cos(Y1 - Y2));
		System.out.print("The distance between the points is " + distance + " km");
	}

}
