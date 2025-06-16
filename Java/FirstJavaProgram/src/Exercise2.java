import java.util.Random;
import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		// Rock, Paper, Scissors Game
		boolean response = true;
		while (response)
		{
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			int computer = r.nextInt(1,4);
			System.out.print("Pick your move (r/p/s) : ");
			String user = sc.next();
			switch (user)
			{
				case "r" ->
				{
					if (computer==1)
					{
						System.out.println("Draw");
					}
					else if(computer==2)
					{
						System.out.println("Computer Wins");
					}
					else
					{
						System.out.println("You Win");
					}
				}
				case "p" ->
				{
					if (computer==1)
					{
						System.out.println("You Win");
					}
					else if(computer==2)
					{
						System.out.println("Draw");
					}
					else
					{
						System.out.println("Computer Wins");
					}
				}
				case "s" ->
				{
					if (computer==1)
					{
						System.out.println("Computer Wins");
					}
					else if(computer==2)
					{
						System.out.println("You Win");
					}
					else
					{
						System.out.println("Draw");
					}
				}
				default -> System.out.println("Invalid Move");
			}
			System.out.print("Wanna play again(y/n) : ");
			String temp = sc.next();
			switch(temp)
			{
				case "y" -> response = true;
				case "n" ->
				{
					System.out.print("Thank You for your time.");
					response = false;
				}
				default ->
				{
					System.out.print("Invalid Response! Try Again");
					response = false;
				}
			}
		}
	}
}