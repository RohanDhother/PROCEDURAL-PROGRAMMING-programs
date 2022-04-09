//Author: Rohan Dhother
//Date: 10/10/2019
import java.util.Scanner;
class Vending_machine
{
	public static void main (String[] param) //This is the main method of the class
	{
		AskForOption();
		System.exit(0);
	}
	public static void AskForOption() //This method asks the user for input of which a option, then prints a response
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose from (A: Packet of Crisps, B: Health Bar, C: Bar of Chocolate)? ");
		String ans = scanner.nextLine();
		if (ans.equals("A"))
		{
			System.out.println("A Packet of Crisps costs 1.50");
		}
		else if (ans.equals("B"))
		{
			System.out.println("A Health Bar costs 1.20");
		}
		else if (ans.equals("C"))
		{
			System.out.println("A Bar of Chocolate costs 2.00");
		}
		else
		{
			System.out.println("I do not have anything for choice " + ans);
		}
	}
}
