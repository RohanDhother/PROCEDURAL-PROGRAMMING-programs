//Authour: Rohan Dhother
//Date: 19/11/2019
import java.util.Scanner;
class expression
{
  public static void main (String[] param)
  //This is the main method that calls other methods
  {
    String EXP = Q();
    int value = 0;
    int i = 0;
    if (EXP.indexOf("+")==-1)
    {
      try{
        value = Integer.parseInt(EXP);
      }
      catch(NumberFormatException ex){
        value = CheckValue(EXP, i);
      }
    }
    else
    {
      value = CheckValue(EXP, i);
    }
    PrintValue(value);
    System.exit(0);
  }
  public static String Q()
  //This asks the user for a input
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input the expression ");
    String ans = scanner.nextLine();
    return ans;
  }
  public static int CheckValue(String EXP, int i)
  //This checks which rule each character in the string relates to
  {
    int a;
    int value = 0;
    if (i==EXP.length())
    {return value;}
    else
    {
      char c = EXP.charAt(i);
      try{
        value = Integer.parseInt(EXP.substring(i, i+1));
        return value;
      }
      catch(NumberFormatException ex){}
      a = Character.toUpperCase(c) - 64;
      if (EXP.substring(i, i+1).equals("+"))
      {
        value = CheckValue(EXP, i+1);
        value = Sum(value, i+1, EXP);
        return value;
      }
      else if (EXP.substring(i, i+1).equals("S") || EXP.substring(i, i+1).equals("s"))
      {
        value = CheckValue(EXP, i+1);
        value = Sn(value);
      }
      else if (a>0)
      {
        if (a<7)
        {
          value = EXP_hex(EXP.substring(i, i+1));
        }
      }
      else
      {
        System.out.println("That is not a valid answer");
        System.exit(0);
      }
    }
    return value;
  }
  public static int Sum(int value, int i, String EXP)
  //This adds all the values after the plus sign
  {
    if (i==EXP.length())
    {return value;}
    else
    {
      value = value + CheckValue(EXP, i+1);
      Sum(value, i+1, EXP);
    }
    return value;
  }
  public static int Sn(int value)
  //This adds all the numbers between 0 and the number given
  {
    if (value==0)
    {
      return value;
    }
    else
    {
      value = value + Sn(value-1);
    }
    return value;
  }
  public static int EXP_hex(String EXP)
  //This returns the hexadecimal value
  {
    int decimal = 0;
    decimal=Integer.parseInt(EXP,16);
    return decimal;
  }
  public static void PrintValue(int value)
  //This prints the answer
  {
    System.out.println("The answer is " + value);
  }
}
