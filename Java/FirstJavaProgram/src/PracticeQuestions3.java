import java.util.Scanner;

public class PracticeQuestions3
{
	public static void main(String[] args)
	{
		// 1. Write a program to convert a string to lowercase
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to be converted to lowercase : ");
		String str1 = sc.nextLine();
		String str1LowerCase = str1.toLowerCase();
		System.out.println("Entered string in lowercase : " + str1LowerCase);
		
		// 2. Write a program to replace spaces with underscores
		String str1Replaced = str1.replace(' ','_');
		System.out.println("Replacing spaces with underscores : " + str1Replaced);
		
		// 3. Write a program to fill in a letter template which looks like below :
		// letter = "Dear <|name|>, Thanks a lot"
		// Replaces <|name|> with a string (some name)
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		String letter = "Dear <|name|>, Thanks a lot";
		System.out.printf("Dear %s, Thanks a lot\n", letter.replace("<|name|>",name));
		
		// 4. Write a program to detect double and triple spaces in a string
		String test = "This  statement has   double and   triple   spaces.";
		System.out.println(test);
		System.out.println("Double spaces at position : " + (test.indexOf("  ")+1));
		System.out.println("Triple spaces at position : " + (test.indexOf("   ")+1));
		
		// 5. Write a program to format the following letter using escape sequence characters.
		// letter = "Dear Harry, This Java course is nice. Thanks!"
		System.out.print("Dear Harry\n\tThis Java course is nice.\nThanks!");
	}
}