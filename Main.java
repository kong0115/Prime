/*
Name of the Student: Siang Swee Kong
	Class: SE 3345
	Section: 003
	Semester: Fall 2018
	Project: 1
	Description: A program that will print all the primes up till the given positive integer value from the user. If the user enters a non-integer value or a non-positive integer value, 
	the program will ask the user for another input. 
*/

import java.util.InputMismatchException; //import the InputMismatchException class to catch the exception throws by invalid input data type
import java.util.Scanner; //to read the input

public class Main {
	private static Scanner scan; 
	public static void main(String[] args) {
		int input; //to store the user input
		boolean goodData = false; //flag to indicate if the user enter a valid input
		scan = new Scanner(System.in); //reading from System.in
		
		while(!goodData) { //keep looping until the user enter a valid input
			try {   
				System.out.println("Please enter a positive integer: ");
				input = scan.nextInt(); //scans the next token of the input as int.
				goodData = true; //set the flag
				if (input <= 0) //if the user enter a non-positive integer, ask for another input
				{
					System.out.println("Inserted value is not positive.");
					goodData = false; //set the flag
				}
				
				else if (input == 1)
				{
					System.out.println("There is no prime up till " + input + " !");
				}
				
				else //if the user enter a positive integer,print all the primes up till the integer value  
				{
					System.out.println("Print all primes up till " + input + " :");
					Prime.printPrime(input);
				}	
			}
			
			catch(InputMismatchException exception1) { //if user enters an invalid data type, catch the exception and ask the user for another input
				System.out.println("Invalid input data type."); //print out error message
				String flush = scan.next(); //clear the value in the buffer
			}
		}
		
	
		System.out.println("End of the program...");
		System.exit(0); //exit the program
	} 
}
