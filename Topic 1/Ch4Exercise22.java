import java.util.Scanner;
public class Exercise22 {

	public static void main(String[] args) {
		//Inputting the strings
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string s1: ");
		String s1 = input.next();
		System.out.print("Enter string s2: ");
		String s2 = input.next();
		//Checking if second string is a substring
		if (s1.contains(s2))
		System.out.print("It is a substring");
		else System.out.print("It is not a substring");
	}

}
