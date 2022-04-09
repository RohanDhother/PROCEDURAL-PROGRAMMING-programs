//Author: Rohan Dhother
//Date: 08/10/2019
import java.util.Scanner;
class impossiblequiz
{
	public static void main (String[] param)//this is the main method that calls the other methods
	{
		questions [] quiz = new questions[3];
		quiz = PopArray(quiz);
		int points = 0;
		points = Qs(points, quiz);
		System.exit(0);
	}
	public static questions [] PopArray(questions [] quiz) //This method populates the array with questions and the correct answer
	{
		questions q = new questions();
		q.question = "\n Which of these is a marvel character? \n \n A : Godzilla \n \n B: Batman \n \n C: Iron man \n ";
		q.answer = "C";
		q.wrong = "B";
		q.impossible = "A";
		quiz[0] = q;
		 q = new questions();
		q.question = "\n Which of these is a DC character? \n \n A : Captain marvel \n \n B: Aquaman \n \n C: Captian underpants \n ";
		q.answer = "B";
		q.wrong = "A";
		q.impossible = "C";
		quiz[1] = q;
		 q = new questions();
		q.question = "\n Which of these is a villan character? \n \n A : Lex luthor \n \n B: Garfield \n \n C: Superman \n ";
		q.answer = "A";
		q.wrong = "C";
		q.impossible = "B";
		quiz[2] = q;
		return quiz;
	}
	public static int Qs (int points, questions [] quiz) //this method does the first question and returns if they got it right or wrong to the main method
	{
		for (int i = 0; i<3; i++)
		{
			String question = getQuestion(quiz[i]);
			System.out.println(question);
			boolean loop = true;
			while (loop == true){
				Scanner scanner = new Scanner(System.in);
				System.out.print(" Answer: ");
				String ans = scanner.nextLine();
				ans = ans.toUpperCase();
				String answer = getAnswer(quiz[i]);
				String wrong = getWrong(quiz[i]);
				String impossible = getImpossible(quiz[i]);
				if (ans.equals(impossible))
				{
					loop = false;
					points = 0;
					System.out.println("\n The answer is Iron man");
					System.out.println("\n That is a impossible answer");
					System.out.println("\n You have " + points + " points");

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
					System.out.println("\n The answer is Iron man");
					System.out.println("\n You have " + points + " points");

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
	public static String getQuestion(questions q) //This method returns the question
	{
		return q.question;
	}
	public static String getAnswer(questions q) //This method returns the correct answer
	{
		return q.answer;
	}
	public static String getWrong(questions q) //This method returns the wrong answer
	{
		return q.wrong;
	}
	public static String getImpossible(questions q) //This method returns the impossible answer
	{
		return q.impossible;
	}
}
class questions //This is the class for the records for each question
{
	String question;
	String answer;
	String wrong;
	String impossible;
}
