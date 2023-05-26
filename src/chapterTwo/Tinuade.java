package chapterTwo;

import java.util.Scanner;

class Tinuade {
    
	public static void main (String [] args) {
	    
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Enter the first integer:");

int highestNumber = scan.nextInt();

int lowestNumber = highestNumber;

System.out.println("Enter the second integer:");

int userInput = scan.nextInt();

if (userInput > highestNumber) highestNumber = userInput;

if (userInput < lowestNumber) lowestNumber  =  userInput;

System.out.println("Enter the third integer:");

 userInput = scan.nextInt();

if (userInput > highestNumber) highestNumber = userInput;

if (userInput < lowestNumber) lowestNumber  =  userInput;

System.out.println("Enter the fourth integer:");

 userInput = scan.nextInt();

if (userInput > highestNumber) highestNumber = userInput;

if (userInput < lowestNumber) lowestNumber  =  userInput;

System.out.println("Enter the fifth integer:");

 userInput = scan.nextInt();

if (userInput > highestNumber) highestNumber = userInput;

if (userInput < lowestNumber) lowestNumber  =  userInput;



    System.out.printf("The largest number is %d%n", highestNumber);

 	System.out.printf("The Smallest number is %d%n", lowestNumber);
	}
	
}