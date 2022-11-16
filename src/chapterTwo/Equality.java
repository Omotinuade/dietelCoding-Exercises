package chapterTwo;

import java.util.Scanner;

public class Equality{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Input first number: ");

				int firstNumber  = input.nextInt();

			System.out.print("Input Second number: ");

				int secondInteger = input.nextInt();

			System.out.print("Input third number: ");

				int thirdInteger = input.nextInt();

			System.out.print("Input fourth number: ");

				int fourthInteger = input.nextInt();

		if (firstNumber == secondInteger && secondInteger == thirdInteger && thirdInteger == fourthInteger){

			System.out.println("Numbers are equal!");

}

			else {

		System.out.println("Numbers are not equal!");
}
}
}