import java.util.Arrays;

public class PracticeQuestions6
{
	public static void main(String[] args)
	{
		// 1. Create an array of 5 floats and calculate their sum
		float[] measurements = {0.5f,1.3f,2.6f,4.5f,6.8f};
		float sum = 0f;
		for(float i:measurements)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		// 2. Write a program to find out whether a given integer is present in an array or not.
		int[] tableOfSeven = {7,14,21,28,35,42,49,56,63,70};
		int num = 37;
		boolean present = false;
		for(int i:tableOfSeven)
		{
			if (i == num)
			{
				present = true;
			}
		}
		System.out.println(present);
		
		// 3. Calculate the average marks from an array containing marks of all students in physics
		//    using a for-each loop.
		double[] marks = {98.5,67.5,87,65,93.5,96.5};
		double total = 0;
		double average = 0;
		for (double i : marks)
		{
			total+=i;
		}
		average = total/(marks.length);
		System.out.println(average);
		
		// 4. Create a Java program to add two matrices of size 2x3.
		int[][] matrix1 = {{4,6,7},{2,4,5}};
		int[][] matrix2 = {{5,1,8},{0,9,3}};
		int[][] matrix3 = new int[2][3];
		for (int i=0;i<matrix1.length;i++)
		{
			for (int j=0;j<matrix1[i].length;j++)
			{
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		for(int i=0;i<matrix3.length;i++)
		{
			for(int j=0;j<matrix3[i].length;j++)
			{
				System.out.print(matrix3[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 5. Write a Java program to reverse an array
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		for(int i=0; i<n; i++)
		{
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		for(int element: arr)
		{
			System.out.print(element + " ");
		}
		System.out.println();
		
		// 6. Write a Java program to find the maximum element in an array.
		int [] arr1 = {-324324, 1, 2100, 3, 455, 5, 34, 67};
		int max = Integer.MIN_VALUE;
		for(int e: arr1)
		{
			if(e>max)
			{
				max = e;
			}
		}
		System.out.println(max);
		
		// 7. Write a Java program to find whether an array is sorted or not.
		boolean isSorted = true;
		int [] arr3 = {1, 12, 3, 4, 5, 34, 67};
		for(int i=0;i<arr3.length-1;i++)
		{
			if(arr3[i] > arr3[i+1])
			{
				isSorted = false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("The Array is sorted");
		}
		else
		{
			System.out.print("The Array is not sorted");
		}
	}
}