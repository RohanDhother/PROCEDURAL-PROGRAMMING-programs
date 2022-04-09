//Author: Rohan Dhother
//Date: 12/11/2019
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.util.ArrayList;
class impossiblequiz
{
	public static void main (String[] param) throws IOException
	//this is the main method that calls the other methods
	{
		String name = Q_name();
		questions [] quiz = new questions[5];
		ArrayList<users> Users_list = new ArrayList<>();
		Users_list = CreateUserArrayList(Users_list);
		questions_options [] options = new questions_options[5];
		options = Popoptions(options);
		quiz = PopArray(quiz);
		int points = 0;
		points = Qs(points, quiz, options);
		Users_list = AddToArrayList(Users_list, name, points);
		Users_list = SortArray(Users_list);
		Fileinput(Users_list);
		PrintLeaderboard(Users_list);
		System.exit(0);
	}
	public static String Q_name()
	//This method asks the user for their name
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name?\n");
		System.out.print("Answer: ");
		String name = scanner.nextLine();
		return name;
	}
		public static ArrayList<users> CreateUserArrayList(ArrayList<users> Users_list) throws IOException
		//This method populates the users_arraylist
		{
			BufferedReader pr = new BufferedReader(new FileReader("file.txt"));
			int lines = 0;
		  String line;
			String[] temp;
			String delimiter = ";";
		  while ((line = pr.readLine()) != null)
		  {
				lines++;
				if (lines>1)
				{
					users u = new users();
					String str = line.toString();
					temp = str.split(delimiter);
					SetName(u, temp[0]);
					SetScore(u, Integer.parseInt(temp[1]));
					SetDate(u, temp[2]);
					SetTime(u, temp[3]);
					Users_list.add(u);
				}
			}
			pr.close();
			return Users_list;
		}
		public static questions_options [] Popoptions(questions_options [] options) throws IOException
		//This method populates an array with the different options for each question
		{
			BufferedReader pr_q = new BufferedReader(new FileReader("questions.txt"));
			int lines = 0;
		  String line;
			String[] temp;
			String delimiter = ";";
		  while ((line = pr_q.readLine()) != null)
		  {
				lines++;
				if (lines>1)
				{
					questions_options o = new questions_options();
					String str = line.toString();
					temp = str.split(delimiter);
					SetOption_1(o, temp[1]);
					SetOption_2(o, temp[2]);
					SetOption_3(o, temp[3]);
					options[lines-2]=o;
				}
			}
			pr_q.close();
			return options;
		}
		public static questions [] PopArray(questions [] quiz) throws IOException
		//This method populates the array with questions and the correct answer
		{
			BufferedReader pr_q = new BufferedReader(new FileReader("questions.txt"));
			int lines = 0;
		  String line;
			String[] temp;
			String delimiter = ";";
		  while ((line = pr_q.readLine()) != null)
		  {
				lines++;
				if (lines>1)
				{
					questions q = new questions();
					String str = line.toString();
					temp = str.split(delimiter);
					SetQuestion(q, temp[0]);
					SetAnswer(q, temp[4]);
					SetWrong(q, temp[5]);
					SetImpossible(q, temp[6]);
					quiz[lines-2]=q;
				}
			}
			pr_q.close();
			return quiz;
		}
		public static int Qs (int points, questions [] quiz, questions_options [] options)
		//this method executes all questions
		{
			String question;
			String answer;
			String wrong;
			String impossible;
			for (int i = 0; i<5; i++)
			{
				question = getQuestion(quiz[i]);
				System.out.println("\n" + question);
				System.out.println("\n " + getOption_1(options[i]));
				System.out.println("\n " + getOption_2(options[i]));
				System.out.println("\n " + getOption_3(options[i]));
				answer = getAnswer(quiz[i]);
				wrong = getWrong(quiz[i]);
				impossible = getImpossible(quiz[i]);
				boolean loop = true;
				while (loop == true){
					Scanner scanner = new Scanner(System.in);
					System.out.print("\n Answer: ");
					String ans = scanner.nextLine();
					ans = ans.toUpperCase();
					if (ans.equals(impossible))
					{
						loop = false;
						points = 0;
						System.out.println("\n you got it wrong \n \n You have " + points + " points");
						System.out.println("\n That is a impossible answer");

					}
					else if (ans.equals(wrong))
					{
						loop = false;
						if (points==0)
						{
							points = 0;
						}
						else
						{
							points = points-1;
						}
						System.out.println("\n you got it wrong \n \n You have " + points + " points");

					}
					else if (ans.equals(answer))
					{
						loop = false;
						points = points + 1;
						System.out.println("\n you got it right \n \n You have " + points + " points");

					}
					else
					{
						System.out.println("\n That is not a valid option");
					}
				}
			}
			return points;
		}
		public static ArrayList<users> AddToArrayList(ArrayList<users> Users_list, String name, int points)
		//This method adds the current users details to the users_arraylist
		{
			String[] temp;
			String date_and_time = getDateAndTime();
			String delimiter = ";";
			temp = date_and_time.split(delimiter);
			String date = temp[0];
			String time = temp[1];
			users u = new users();
			SetName(u, name);
			SetScore(u, points);
			SetDate(u, date);
			SetTime(u, time);
			Users_list.add(u);
			return Users_list;
		}
		public static ArrayList<users> SortArray(ArrayList<users> Users_list)
		//This method sorts the users_arraylist
		{
			String temp_name;
			int temp_score;
			String temp_date;
			String temp_time;
			for (int i = 0; i < Users_list.size() - 1; i++)
			{
				for (int j = 1; j < Users_list.size() - i; j++)
				{
					if (getScore(Users_list.get(j-1)) < getScore(Users_list.get(j)))
					{
						temp_name = getName(Users_list.get(j-1));
						temp_score = getScore(Users_list.get(j-1));
						temp_date = getDate(Users_list.get(j-1));
						temp_time = getTime(Users_list.get(j-1));
						SetName(Users_list.get(j-1), getName(Users_list.get(j)));
						SetScore(Users_list.get(j-1), getScore(Users_list.get(j)));
						SetDate(Users_list.get(j-1), getDate(Users_list.get(j)));
						SetTime(Users_list.get(j-1), getTime(Users_list.get(j)));
						SetName(Users_list.get(j), temp_name);
						SetScore(Users_list.get(j), temp_score);
						SetDate(Users_list.get(j), temp_date);
						SetTime(Users_list.get(j), temp_time);
					}
				}
			}
			return Users_list;
		}
		public static void Fileinput(ArrayList<users> Users_list) throws IOException
		//This method inputs the newly sorted users_arraylist
		{
			File file = new File("file.txt");
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
	    FileWriter fr = new FileWriter(file, true);
	    BufferedWriter br = new BufferedWriter(fr);
			br.write("Name;Score;Date;Time;");
			for (int i = 0; i<Users_list.size(); i++)
			{
				br.write("\n" +getName(Users_list.get(i)) + ";" + getScore(Users_list.get(i)) + ";" + getDate(Users_list.get(i)) + ";" + getTime(Users_list.get(i)) + ";");
			}
	  	br.close();
			fr.close();
		}
		public static void PrintLeaderboard(ArrayList<users> Users_list)
		//This method prints the leaderboard
		{
			System.out.println("\nName\tScore\tDate\t\tTime");
			for (int i = 0; i<Users_list.size(); i++)
			{
				System.out.println(getName(Users_list.get(i)) + "\t" + getScore(Users_list.get(i)) + "\t" + getDate(Users_list.get(i)) + "\t" + getTime(Users_list.get(i)));
			}
		}
		public static String getQuestion(questions q)
		//This method returns the question
		{
			return q.question;
		}
		public static String getAnswer(questions q)
		//This method returns the correct answer
		{
			return q.answer;
		}
		public static String getWrong(questions q)
		//This method returns the wrong answer
		{
			return q.wrong;
		}
		public static String getImpossible(questions q)
		//This method returns the impossible answer
		{
			return q.impossible;
		}
		public static questions SetQuestion(questions q, String question)
		//This method sets the question to a record
		{
			q.question = question;
			return q;
		}
		public static questions SetAnswer(questions q, String answer)
		//This method sets the correct answer to a record
		{
			q.answer = answer;
			return q;
		}
		public static questions SetWrong(questions q, String wrong)
		//This method sets the wrong answer to a record
		{
			q.wrong = wrong;
			return q;
		}
		public static questions SetImpossible(questions q, String impossible)
		//This method sets the impossible answer to a record
		{
			q.impossible = impossible;
			return q;
		}
		public static String getName(users u)
		//This returns the name
		{
			return u.name;
		}
		public static int getScore(users u)
		//This returns the score
		{
			return u.score;
		}
		public static String getDate(users u)
		//This returns the date
		{
			return u.date;
		}
		public static String getTime(users u)
		//This returns the time
		{
			return u.time;
		}
		public static users SetName(users u, String name)
		//This method sets the name to a record
		{
			u.name = name;
			return u;
		}
		public static users SetScore(users u, int score)
		//This method sets the score to a record
		{
			u.score = score;
			return u;
		}
		public static users SetDate(users u, String date)
		//This method sets the date to a record
		{
			u.date = date;
			return u;
		}
		public static users SetTime(users u, String time)
		//This method sets the time to a record
		{
			u.time = time;
			return u;
		}
		public static String getDateAndTime ()
		//This method returns the date and time
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy;HH:mm:ss");
	   	LocalDateTime now = LocalDateTime.now();
	   	String date_and_time = dtf.format(now);
			return date_and_time;
		}
	public static String getOption_1(questions_options o)
	//This method returns the first option for each question
	{
		return o.option_1;
	}
	public static String getOption_2(questions_options o)
	//This method returns the second option for each question
	{
		return o.option_2;
	}
	public static String getOption_3(questions_options o)
	//This method returns the thrid option for each question
	{
		return o.option_3;
	}
	public static questions_options SetOption_1(questions_options o, String option_1)
	//This method sets the first option to a record
	{
		o.option_1 = option_1;
		return o;
	}
	public static questions_options SetOption_2(questions_options o, String option_2)
	//This method sets the second option to a record
	{
		o.option_2 = option_2;
		return o;
	}
	public static questions_options SetOption_3(questions_options o, String option_3)
	//This method sets the thrid option to a record
	{
		o.option_3 = option_3;
		return o;
	}
}
class questions
//This is the class for the records for each question
{
	String question;
	String answer;
	String wrong;
	String impossible;
}
class users
//This is the class for the records for each users
{
	String name;
	int score;
	String date;
	String time;
}
class questions_options
//This is the class for the records for each question's options
{
	String option_1;
	String option_2;
	String option_3;
}
