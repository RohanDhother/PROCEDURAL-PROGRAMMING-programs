//Authour: Rohan Dhother
//Date:20/10/2019
import java.util.Scanner;
class n_in_bed
{
	public static void main (String[] param) //This is the main method
	{
		int n_people = Qn_people();
		beds(n_people);
		System.exit(0);
		
	}
	public static int Qn_people() //This method asks a question and returns the answer
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many are there in the bed? ");
		int n = scanner.nextInt();
		return n;
	}
	public static void beds(int n_people) //This method loops through a for loops
	{
		for (int n = n_people; n>=2; n--)
		{
			System.out.println("There were " + n + " in the bed and the little one said");
			System.out.println("Roll Over, Roll Over");
			System.out.println("So they all rolled over and one fell out.");
		}
		System.out.println("There was 1 in the bed and the little one said");
		System.out.println("Good night.");
	}
}