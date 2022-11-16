package chapterTwo;

import java.util.Scanner;

public class Palindrome{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Please enter a three digit number: ");

int number = input.nextInt();

int digit1 = number / 100 % 10;

int digit2 = number / 10 % 10;

int digit3 = number / 1 % 10;


if (digit1 == digit3) {

System.out.println("IT IS A PALINDROME!");

}

else {

System.out.println("IT IS NOT A PALINDROME!");

}


}





}