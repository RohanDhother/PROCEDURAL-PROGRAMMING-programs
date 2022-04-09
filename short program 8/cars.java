//Authour: Rohan Dhother
//Date: 23/10/2019
import java.util.Scanner;
class cars_class
{
	public static void main (String[] param) //This is the main method
	{
		final int n_array = 3;
		cars [] cars_array = new cars[n_array];
		cars_array = PopCars(cars_array);
		String car_user_answer = Q();
		CheckAnswer(cars_array, car_user_answer);
		System.exit(0);
	}
	public static String Q() //This asks the user a questions and returns the answer
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n The options are: \n \n Triumph \n \n Focus \n \n Mini e \n");
		System.out.print("What car do you need to know about? ");
		String car = scanner.nextLine();
		return car;
	}
	public static cars [] PopCars(cars [] cars_array) //This creates and populates an array
	{
		cars c1 = new cars();
		setMake_1("TRIUMPH", c1);
		setElectric_1(false, c1);
		cars_array[0] = c1;
		cars c2 = new cars();
		setMake_2("FOCUS", c2);
		setElectric_2(false, c2);
		cars_array[1] = c2;
		cars c3 = new cars();
		setMake_3("MINI E", c3);
		setElectric_3(true, c3);
		cars_array[2] = c3;
		return cars_array;
	}
	public static cars setMake_1(String make, cars c1)
	{
		c1.make = make;
		return c1;
	}
	public static cars setElectric_1(boolean electric, cars c1)
	{
		c1.electric = electric;
		return c1;
	}
	public static cars setMake_2(String make, cars c2)
	{
		c2.make = make;
		return c2;
	}
	public static cars setElectric_2(boolean electric, cars c2)
	{
		c2.electric = electric;
		return c2;
	}
	public static cars setMake_3(String make, cars c3)
	{
		c3.make = make;
		return c3;
	}
	public static cars setElectric_3(boolean electric, cars c3)
	{
		c3.electric = electric;
		return c3;
	}
	public static void CheckAnswer(cars [] cars_array, String car_user_answer) //This checks which make the user inputted and returns if it is electric
	{
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		String car;
		while (loop==true)
		{
			car_user_answer = car_user_answer.toUpperCase();
			if (car_user_answer.equals(getMake_car_1(cars_array[0])))
			{
				car_user_answer = car_user_answer.toLowerCase();
				car = car_user_answer.substring(0, 1).toUpperCase() + car_user_answer.substring(1);
				if (getElectric_car_1(cars_array[0]))
				{
					System.out.println("\n The " + car + " is electric. \n");
				}
				else
				{
					System.out.println("\n The " + car + " is NOT electric.\n");
				}
				loop = false;
			}
			else if (car_user_answer.equals(getMake_car_2(cars_array[1])))
			{
				car_user_answer = car_user_answer.toLowerCase();
				car = car_user_answer.substring(0, 1).toUpperCase() + car_user_answer.substring(1);
				if (getElectric_car_2(cars_array[1]))
				{
					System.out.println("\n The " + car + " is electric. \n");
				}
				else
				{
					System.out.println("\n The " + car + " is NOT electric. \n");
				}
				loop = false;
			}
			else if (car_user_answer.equals(getMake_car_3(cars_array[2])))
			{
				car_user_answer = car_user_answer.toLowerCase();
				car = car_user_answer.substring(0, 1).toUpperCase() + car_user_answer.substring(1);
				if (getElectric_car_3(cars_array[2]))
				{
					System.out.println("\n The " + car + " is electric. \n");
				}
				else
				{
					System.out.println("\n The " + car + " is NOT electric. \n");
				}
				loop = false;
			}
			else
			{
				System.out.println("\n I do not know that make ");
				car_user_answer = Q();
			}
		}
	}
	public static String getMake_car_1(cars c1) //This gets the make of the car
	{
		return c1.make;
	}
	public static boolean getElectric_car_1(cars c1) //This returns if electric car
	{
		return c1.electric;
	}
	public static String getMake_car_2(cars c2) //This gets the make of the car
	{
		return c2.make;
	}
	public static boolean getElectric_car_2(cars c2) //This returns if electric car
	{
		return c2.electric;
	}
	public static String getMake_car_3(cars c3) //This gets the make of the car
	{
		return c3.make;
	}
	public static boolean getElectric_car_3(cars c3) //This returns if electric car
	{
		return c3.electric;
	}
}
class cars //This is a record of each film
{
	String make;
	boolean electric;
}
