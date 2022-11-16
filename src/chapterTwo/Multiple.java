package chapterTwo;

import java.util.Scanner;

public class Multiple{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the first number:");

	int firstNumber = scan.nextInt();

System.out.println("Enter the second number:");

	int secondNumber = scan.nextInt();

if (3 * firstNumber % 2 * secondNumber == 0){
System.out.println("Tripple of firstNumber is a multiple of the secondNumber when doubled");

}
else {
System.out.println("Tripple of firstNumber is not a multiple of the secondNumber when doubled");
}

}



}