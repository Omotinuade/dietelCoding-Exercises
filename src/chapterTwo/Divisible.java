package chapterTwo;

import java.util.Scanner;

public class Divisible{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number: ");

	int number = input.nextInt();

	int result = number % 3;
	
if (result == 0 ){

System.out.print("Number is divisible by 3");
}


if (result != 0){

System.out.print("Number is not divisible by 3");
}



}




}