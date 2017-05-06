import java.util.Scanner;
public class Exercise17 {

	public static void main(String[] args) {
		// Input year and month
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		//Creates strings for months
		String month2 = "Feb";
		String month4 = "Apr";
		String month6 = "Jun";
		String month9 = "Sep";
		String month11 = "Nov";
		String day = "31";
		String yes = "true";
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
		String leapYear = String.valueOf(isLeapYear);
		//Checks for the month
		if (month.equals(month4))
		day = "30";
		if (month.equals(month6))
			day = "30";
		if (month.equals(month9))
			day = "30";
		if (month.equals(month11))
			day = "30";
		if (month.equals(month2)){
			if (leapYear.equals(yes))
			{
				day = "29";
			}
			else day = "28";
		}
			
		//Outputs answer
		System.out.print(month + " " + year + " has " + day + " days");
	}

}
