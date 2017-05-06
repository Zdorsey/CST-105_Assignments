import java.util.Scanner;
public class Exercise5 
{

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Subtotal: ");
	double Subtotal = input.nextDouble();
	System.out.print("Enter Gratuity Rate: ");
	int Gratuity_rate = input.nextInt();
	double Gratuity = Gratuity_rate / 100.00;
	double Tip = Subtotal * Gratuity;
	double Total = Tip + Subtotal;
	System.out.print("The tip is $" + (int)(Tip * 100)/100.0 + " and the total is $" + (int)(Total * 100)/100.0);
	}

}
