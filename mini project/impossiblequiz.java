//Author: Rohan Dhother
//Date: 08/10/2019
import java.util.Scanner;
class impossiblequiz
{
	public static void main (String[] param)//this is the main method that calls the other methods
	{
		int points = 0;
		int points_Q1 = Q1();
		if (points_Q1==0)
		{
			points = 0;
		}
		else
		{
			points = points_Q1;
		}
		System.out.println("You have " + points + " points");
		System.exit(0);
	}
	public static int Q1 () //this method does the first question and returns if they got it right or wrong to the main method
	{
		boolean loop = true;
		int points=0;
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
			points = 0;
			System.out.println("The answer is chocolate");
			
		}
		else if (ans.equals("B"))
		{
			loop = false;
			points = 0;
			System.out.println("The answer is chocolate");
			
		}
		else if (ans.equals("C"))
		{
			loop = false;
			points = 1;
			
		}
		else
		{
			System.out.println("That is not a valid option");
		}
		}
	return points;
	}
}

		
