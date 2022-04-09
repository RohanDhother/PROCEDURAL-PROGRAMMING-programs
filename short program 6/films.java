//Authour: Rohan Dhother
//Date: 23/10/2019
import java.util.Scanner;
class film_class
{
	public static void main (String[] param) //This is the main method
	//This creates and populates an array with the user's inputs
	//This prints out the array
	{
		Scanner scanner = new Scanner(System.in);
		final int n_array = 5;
		films [] films_array = new films[n_array];
		for (int i = 0; i<n_array; i++)
		{
			films f = new films();
			f.name = name_film();
			f.money_made = money_film(f.name);
			films_array[i] = f;
			System.out.println(" ");
		}
		System.out.println("The films and the amount they made are: ");
		int total = 0;
		for (int i = 0; i<n_array; i++)
		{
			total = total + getmoney_made(films_array[i]);
			System.out.println(message(films_array[i]));
		}
		String message_1 = "Together these 5 films took ";
		String message_2 = " million pounds at the box office.";
		PrintMessage(total, message_1, message_2);
		System.exit(0);
	}
	public static void PrintMessage(int total, String message_1, String message_2)
	{
		System.out.println(message_1 + total + message_2);
	}
	public static int getmoney_made(films f) //This gets the cost of each film
	{
		int total = getmoney(f);
		return total;
	}
	public static String message(films f) //This creates a message
	{
		String array_message = getname(f) + ", " + getmoney(f)*1000000;
		return array_message;
	}
	public static String name_film() //This asks the user a questions and returns the answer
	{
		Scanner scanner = new Scanner(System.in);
		films f = new films();
		System.out.print("Film: ");
		f.name = scanner.nextLine();
		return f.name;
	}
	public static int money_film(String name) //This asks the user a questions and returns the answer
	{
		Scanner scanner = new Scanner(System.in);
		films f = new films();
		//f.money_made
		System.out.print("How much money did " + name + " take in millions of pounds? ");
		String money = scanner.nextLine();
		boolean loop=true;
		while(loop==true)
		{
			if(money==null)
				loop = false;
			try {
				f.money_made=Integer.parseInt(money);
				loop = false;
			} catch(NumberFormatException ex)
			{
				System.out.println("Not a number , Try Again");
				System.out.print("How much money did " + name + " take in millions of pounds? ");
				money = scanner.nextLine();
			}
		}
		return f.money_made;
	}
	public static String getname(films f) //This returns the name of the film
	{
		return f.name;
	}
	public static int getmoney(films f) //This returns the cost of the film
	{
		return f.money_made;
	}
}
class films //This is a record of each film
{
	String name;
	int money_made;
}
