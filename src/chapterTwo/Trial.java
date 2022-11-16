package chapterTwo;

import java.util.Scanner;

	public class Trial{

		public static void main(String[] args){

Scanner scan = new Scanner(System.in);

	System.out.println("Enter first number:");

		int firstNumber = scan.nextInt();

	System.out.println("Enter second number:");

		int secondNumber = scan.nextInt();

	System.out.println("Enter third number:");

		int thirdNumber = scan.nextInt();

	System.out.println("Enter fourth number:");

		int fourthNumber = scan.nextInt();

	System.out.println("Enter fifth number:");

		int fifthNumber = scan.nextInt();

if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){

	System.out.printf("The largest number is %d%n", firstNumber);
}

if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){

	System.out.printf("The largest number is %d%n", secondNumber);
}


if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){

	System.out.printf("The largest number is %d%n", thirdNumber);
}

if (fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber){

	System.out.printf("The largest number is %d%n", fourthNumber);
}

if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){

	System.out.printf("The largest number is %d%n", fifthNumber);
}

if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){

	System.out.printf("The lowest number is %d%n", firstNumber);
}

if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){

	System.out.printf("The lowest number is %d%n", secondNumber);
}


if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){

	System.out.printf("The lowest number is %d%n", thirdNumber);
}

if (fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){

	System.out.printf("The lowest number is %d%n", fourthNumber);
}

if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){

	System.out.printf("The lowest number is %d%n", fifthNumber);
}




}
}