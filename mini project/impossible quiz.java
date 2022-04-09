//Author: Rohan Dhother
//Date: 08/10/2019
import java.util.Scanner;
class quiz
{
	public static void main (String[] param)
	{
		Q1();
		System.exit(0);
	}
	public static void Q1 ()
	{
		int points = 0;
		boolean loop = true;
		while (loop = true){
		System.out.println("Which of these is not a element");
		System.out.println("Please choose a option");
		System.out.println("A : Argon");
		System.out.println("B : Oxygen");
		System.out.println("C : Chocolate");
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		if (ans.equals("A"))
		{
			System.out.println("That is wrong");
			points = 0;
			System.out.println("your points is " + points);
			loop = false;
		}
		else if (ans.equals("B"))
		{
			System.out.println("That is wrong");
			points = 0;
			System.out.println("your points is " + points);
			loop = false;
		}
		else if (ans.equals("C"))
		{
			System.out.println("That is right");
			points = points + 1;
			System.out.println("your points is " + points);
			loop = false;
		}
		else
		{
			System.out.println("That is not a valid option");
		}
		}
	}
}

		
