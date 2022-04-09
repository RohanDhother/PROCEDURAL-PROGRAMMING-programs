import java.util.Scanner;
class bus
{
  public static void main (String[] param) //This is the main method that calls the other methods
  {
    Q_buses();
    System.exit(0);
  }
  public static void Q_buses() //This method asks the user two questions
  {

    int latest_bus = 0;
    int latest_time = 0;
    int n_bus = 0;
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    int bus = 0;
    String bus_string;
    String late_string;
    int late = 0;
    while (loop==true)
    {
      boolean loop_number_check = true;
      System.out.print("which bus passed? ");
      bus_string = scanner.nextLine();
      while(loop_number_check==true)
      {
        try {
          bus=Integer.parseInt(bus_string);
          loop_number_check = false;
        } catch(NumberFormatException ex)
        {
          System.out.println("Not a number , Try Again");
          System.out.print("which bus passed? ");
          bus_string = scanner.nextLine();
        }
      }
      if (bus==0)
      {
        loop = false;
      }
      else
      {
        n_bus = n_bus +  1;
        loop_number_check = true;
        System.out.print("How many minutes late was it? ");
        late_string = scanner.nextLine();
        while(loop_number_check==true)
        {
          try {
            late=Integer.parseInt(late_string);
            loop_number_check = false;
          } catch(NumberFormatException ex)
          {
            System.out.println("Not a number , Try Again");
            System.out.print("How many minutes late was it? ");
            late_string = scanner.nextLine();
          }
        }
        System.out.println("");
        if (late>latest_time)
        {
          latest_time = late;
          latest_bus = bus;
        }
      }
    }
    System.out.println("");
    System.out.println(n_bus + " buses passed. The most delayed bus was " + latest_time + " minutes late on route " + latest_bus + ".");
  }
}
