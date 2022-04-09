//Author: Rohan Dhother
//Date: 08/10/2019
import java.util.Scanner;
class impossiblequiz_L1
{
	public static void main (String[] param)//this is the main method that calls the other methods
	{
		Q1();
		System.exit(0);
	}
	public static void Q1 () //this method does the first question and returns if they got it right or wrong to the main method
	{
		boolean loop = true;
		while (loop == true){
		System.out.println("Which of these is not a element");
		System.out.println("Please choose a option");
		System.out.println("A : Argon");
		System.out.println("B : Oxygen");
		System.out.println("C : Chocolate");
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		ans = ans.toUpperCase();
		if (ans.equals("A"))
		{
			loop = false;
			System.out.println("The answer is chocolate");
			
		}
		else if (ans.equals("B"))
		{
			loop = false;
			System.out.println("The answer is chocolate");
			
		}
		else if (ans.equals("C"))
		{
			loop = false;
			
		}
		else
		{
			System.out.println("That is not a valid option");
		}
		}
	}
}

		
