package chapterTwo;

import java.util.Scanner;

public class Arithmetic{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");

				int a = input.nextInt();

			System.out.print("Enter second integer: ");

				int b = input.nextInt();

					int squareA = a * a;

					int squareB = b * b;
					
					int sum = squareA + squareB;
					
					int minus = squareA - squareB;

			System.out.printf("Square of a is %d%nSquare of b is %d%n", squareA, squareB);	
			System.out.printf("Sum of squares is %d%nDifference of squares is %d%n", sum, minus);
		

						
					
	














}



















}