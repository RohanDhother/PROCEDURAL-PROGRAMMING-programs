import java.util.Scanner;
class flooring
{
	public static void main (String[] param)
	{
		Double Length = get_length();
		Double Width = get_width();
		double area = ((Length * Width)/10000);
		double wastage = area*0.1;
		double total = area + wastage;
		total = total*10;
		int totall = (int)total;
		total = (double)totall / 10;
		System.out.println("Your room area is " + area + " m2");
		System.out.println("The extra you need for wastage is " + wastage + " m2");
		System.out.println("The total flooring area to order is: " + total + " m2");
		System.exit(0);
	}
	public static Double get_length()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter your length ");
		double length = scanner.nextDouble();
		return length;
	}
	public static Double get_width()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your width ");
		double width = scanner.nextDouble();
		return width;
	}
}		