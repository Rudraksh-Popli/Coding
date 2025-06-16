import java.util.Scanner;

public class SwitchCaseStatements
{
	public static void main(String[] args)
	{
		/*
		
		Switch(var)
		{
			Case C1:
				//Code;
				break;
			Case C2:
				//Code;
				break;
			Case C3:
				//Code
				break;
			default:
				//Code
		}
		
		Replace ":" with "->" instead of adding "break;" in every case (Smart Switch Statement)
		
		*/
		
		String var = "Saurabh";
		
		switch (var)
		{
			case "Shubham" ->
			{
				System.out.println("You are going to become an Adult!");
				System.out.println("You are going to become an Adult!");
				System.out.println("You are going to become an Adult!");
			}
			case "Saurabh" -> System.out.println("You are going to join a Job!");
			case "Vishaka" -> System.out.println("You are going to get retired!");
			default -> System.out.println("Enjoy Your life!");
		}
		
		System.out.print("Thanks for using my Java Code!");
		
		/*
		
        int age;
        System.out.print("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        
        if (age>56)
        {
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else
        {
            System.out.println("You are not experienced");
        }
        
        if(age>2)
        {
            System.out.print("You are not a baby!");
        }
        
        */
	}
}