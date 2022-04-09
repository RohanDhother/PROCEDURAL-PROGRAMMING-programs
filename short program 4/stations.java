//Author: Rohan Dhother
//Date: 15/10/2019
import java.util.Scanner;
class stations
{
	public static void main (String[] param) //This is the main method of the class
	{
		String station = station();
		station_info s1 = new station_info();
		s1.name = "Stepney Green";
		s1.toliet = false;
		s1.cost = 0;
		station_info s2 = new station_info();
		s2.name = "Kings Cross";
		s2.toliet = true;
		s2.cost = 10;
		station_info s3 = new station_info();
		s3.name = "Green Park";
		s3.toliet = true;
		s3.cost = 30;
		station_info s4 = new station_info();
		s4.name = "Oxford Circus";
		s4.toliet = false;
		s4.cost = 0;
		station_info s5 = new station_info();
		s5.name = "Oxford Street";
		s5.toliet = false;
		s5.cost = 0;
		CheckValue(station);
		System.exit(0);
	}
	public static void CheckValue(String station) //This method checks which station the user has entered
	{
		if (station.equals(s1.name.toLowerCase()))
		{
			if (s1.toliet)
			{
				System.out.println(s1.name + " does have a toliet costing " + s1.cost + "p.");
			}
			else
			{
			System.out.println(s1.name + " does not have a toliet.");
			}
		}
		else if (station.equals(s2.name.toLowerCase()))
		{
			if (s2.toliet)
			{
				System.out.println(s2.name + " does have a toliet costing " + s2.cost + "p.");
			}
			else
			{
			System.out.println(s2.name + " does not have a toliet.");
			}
		}
		else if (station.equals(s3.name.toLowerCase()))
		{
			if (s3.toliet)
			{
				System.out.println(s3.name + " does have a toliet costing " + s3.cost + "p.");
			}
			else
			{
			System.out.println(s3.name + " does not have a toliet.");
			}
		}
		else if (station.equals(s4.name.toLowerCase()))
		{
			if (s4.toliet)
			{
				System.out.println(s4.name + " does have a toliet costing " + s4.cost + "p.");
			}
			else
			{
			System.out.println(s4.name + " does not have a toliet.");
			}
		}
		else if (station.equals(s5.name.toLowerCase()))
		{
			System.out.println("Is Oxford Street a London Underground Station? Check your spelling.");
		}
		else
		{
			System.out.println("Either I don't have that station in my records or you have typed a invalid answer");
			station = station();
		}
	}
	public static String station() //This method asks a question and returns the answer
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("The options are:");
		System.out.println("Stepney Green");
		System.out.println("Kings Cross");
		System.out.println("Green Park");
		System.out.println("Oxford Circus");
		System.out.print("What station do you need to know about? ");
		String ans = scanner.nextLine();
		ans.toLowerCase();
	return ans;
	}
}
class station_info
{
	String name;
	boolean toliet;
	int cost;
}
