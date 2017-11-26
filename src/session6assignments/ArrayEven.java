package session6assignments; //Package declaration

import java.util.Scanner; //imports Scanner file from java.lang package

/**
 * This class declares an integer array of size 10, initializes using for loop
 * with 1 to 10, and prints all even numbers from an array.
 *
 */
public class ArrayEven {
	public static void main(String[] args)
	/*
	 * This is main method which accepts command line argument and returns no value
	 */
	{
		int array[] = new int[10]; /* Declaration and instantiation of an array */
		System.out.println("Enter the ten integer numbers to be evaluated");
		/* Prompting the user to feed the numbers */
		Scanner readNumber = new Scanner(System.in);
		/* Creating Scanner object to read the inputs */
		for (int i = 1; i <= 10; i++) /* For loop that iterates ten times to save the inputs */
		{
			array[i - 1] = readNumber.nextInt(); /* Saving the numbers in the array */
		} // for loop closed

		readNumber.close(); // Scanner closed//

		System.out.println("The list of even numbers are:"); /* Heading for the list of even numbers */
		for (int i = 1; i <= 10; i++) /* for loop that iterates ten times used to print even numbers */
		{
			if (((array[i - 1] % 2) == 0)) /*
											 * If block to check if the content of the array at a particular index is an
											 * even number
											 */
			{
				System.out.println(array[i - 1]); // Prints the even number//
			} // if block closed
			else // else block if content of array is not an even number
			{
				continue; // continue to for loop in this case
			} // else block closed
		} // for loop closed
	} // main method closed
} // Class closed
