import java.util.Scanner;

public class Strings
{
	public static void main(String[] args)
	{
		// String name = new String("Rudraksh Popli");
		String name = "Rudraksh Popli";
		System.out.print("The name is : ");
		System.out.println(name);

		/*
		int a = 6;
		float b = 7.8312f;
		System.out.printf("The value of a is %d and the value of b is %8.2f\n", a,b);
		System.out.format("The value of a is %d and the value of b is %f\n", a,b);

		Scanner sc = new Scanner(System.in);
		// String st = sc.next();
		String st = sc.nextLine();
		System.out.println(st);
		*/

		// String Methods
		int value = name.length();
		System.out.println("Length : " + value);

		String nameLowerCase = name.toLowerCase();
		System.out.println("Lowercased : " + nameLowerCase);
		String nameUpperCase = name.toUpperCase();
		System.out.println("Uppercased : " + nameUpperCase);

		String untrimmedString = "      Rudraksh Popli        ";
		System.out.println("Untrimmed String : " + untrimmedString);
		String trimmedString = untrimmedString.trim();
		System.out.println("Trimmed String : " + trimmedString);

		System.out.println("Substring from index 3 : " + name.substring(3));
		// End Index is not included
		System.out.println("Substring from index 3 to index 7 : " + name.substring(3,7));

		System.out.println("Replacing 'R' with 'V' : " + name.replace('R','V'));
		System.out.println("Replacing 'Rudra'' with 'Svesb' : " + name.replace("Rudra","Svesb"));

		System.out.println("Does String start with 'W' : " + name.startsWith("W"));
		System.out.println("Does String end with 'li' : " + name.endsWith("li"));

		System.out.println("Character at index 7 : " + name.charAt(7));

		System.out.println("Index of 'u' : " + name.indexOf("u"));
		System.out.println("Index of 'u' starting from index 1 : " + name.indexOf("u",2));
		System.out.println("Index of 'p' starting from index 5 : " + name.indexOf("p",5));

		System.out.println("Last index of 'i' : " + name.lastIndexOf("i"));
		System.out.println("Last index of 'a' till index 2 : " + name.lastIndexOf("a",2));
		System.out.println("Last index of 'a' till index 11 : " + name.lastIndexOf("a",11));

		System.out.println("Name equal to 'John Wick' : " + name.equals("John Wick"));
		System.out.println("Name equal to 'Rudraksh' : " + name.equals("Rudraksh"));
		System.out.println("Name equal to 'Popli' : " + name.equals("Popli"));
		System.out.println("Name equal to 'Rudraksh Popli' : " + name.equals("Rudraksh Popli"));

		System.out.println("Name equal to 'RUDRAKSH POPLI' (ignoring case) : "+name.equalsIgnoreCase("RUDRAKSH POPLI"));
		System.out.println("Name equal to 'Rudraksh popli' (ignoring case) : "+name.equalsIgnoreCase("Rudraksh popli"));
		System.out.println("Name equal to 'rudraksh Popli' (ignoring case) : "+name.equalsIgnoreCase("rudraksh Popli"));
		System.out.println("Name equal to 'rudraksh popli' (ignoring case) : "+name.equalsIgnoreCase("rudraksh popli"));
		System.out.println("Name equal to 'rUDRAKSH pOPLI' (ignoring case) : "+name.equalsIgnoreCase("rUDRAKSH pOPLI"));

		System.out.println("\"Double Quotes\"");
		System.out.println("'Single Quote'");
		System.out.println("\'Single Quote\'");
		System.out.println("Back \\ Slash");
		System.out.println("New -->\n--> Line");
		System.out.print("Tab\tTab");
	}
}