public class Arrays
{
	public static void main(String[] args)
	{
		/* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
		
		// There are three main ways to create an array in Java
		// 1. Declaration and memory allocation
		// int [] marks = new int[5];
		
		// 2. Declaration and then memory allocation
		// int [] marks;
		// marks = new int[5];
		// Initialization
		// marks[0] = 100;
		// marks[1] = 60;
		// marks[2] = 70;
		// marks[3] = 90;
		// marks[4] = 86;
		
		// 3. Declaration, memory allocation and initialization together
		int [] marks = {98, 45, 79, 99, 80};
		
		System.out.println(marks.length);
		// marks[5] = 96; - throws an error
		System.out.println(marks[4]);
		
		// Array Traversal
		
		for (int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		// Declaring an array
		int[] arr ={1,2,3,3,4,5};
		// Traversing the array with for-each loop
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		// Multidimensional Arrays
		
		int [] marks1; // A 1-D Array
		int [][] flats; // A 2-D Array
		flats = new int [2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		// Displaying the 2-D Array (for loop)
		System.out.println("Printing a 2-D array using for loop");
		for(int i=0;i<flats.length;i++)
		{
			for(int j=0;j<flats[i].length;j++)
			{
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}