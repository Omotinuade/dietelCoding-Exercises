package chapterTwo;

import java.util.Scanner;

	public class Calculate{

		public static void main(String[] args){

			Scanner scan = new Scanner(System.in);

		System.out.print("Input first number:");

			int firstNumber = scan.nextInt();

		System.out.print("Input second number:");

			int secondNumber = scan.nextInt();
				
		System.out.print("Input third number:");

			int thirdNumber = scan.nextInt();

		double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
		
		System.out.println("The Average of the numbers is " +average);
}
}
