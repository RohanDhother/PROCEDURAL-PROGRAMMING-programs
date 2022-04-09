//Author: Rohan Dhother
//Date: 01/10/2019
//This program asks the user for the length and width of a room and works out the area of flooring that will be needed
import java.util.Scanner; //This imports the module scanner to get the users inputs from the keyboard
class flooring
{
	public static void main (String[] param) //This is the main method that is run at the start of the code
	{
	double Length;
	double Width;
	Length = getlength ();
	Width = getwidth ();
	//This is a while loop to make sure the user does not enter valeus that are larger than 10,000
	while (Length >= 10000 && Width >= 10000){
	System.out.println("Please enter a length and width that is less than 10000 (in cm)");
	Length = getlength ();
	Width = getwidth ();
	}
	double area = ((Length * Width)/10000);
	double wastage = area*0.1;
	double total = area + wastage;
	total = total * 10;
	int total1 = (int)total;
	total = (double)total1 /10;
	System.out.println("Your room area is " + area + " m2");
	System.out.println("The extra you need for wastage is " + wastage + " m2");
	System.out.println("The total flooring area to order is: " + total + " m2");
	System.exit(0);
	}

	public static double getlength() //This method asks the user for the length of the room in cm
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your length (in cm)");
	double length = scanner.nextDouble();
	return length;
	}
	public static double getwidth() //This method asks the user for the width of the room in cm
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your width (in cm)");
	double width = scanner.nextDouble();
	return width;
	}
}
