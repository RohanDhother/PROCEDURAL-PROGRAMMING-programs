import java.util.Scanner;
class vending
{
	public static void main (String[] param)
	{
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop==true)
		{
			System.out.print("Please enter number ");
			String ans = scanner.nextLine();
			if (ans.equals("A"))
			{
				System.out.println("A");
				loop = false;
			}
			else if (ans.equals("B"))
			{
				System.out.println("B");
				loop = false;
			}
			else if (ans.equals("C"))
			{
				System.out.println("C");
				loop = false;
			}
			else
			{
				System.out.println("Not valid answer");
			}
		}
	}
}