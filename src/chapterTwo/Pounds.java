package chapterTwo;

import java.util.Scanner;

public class Pounds{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");

float number = input.nextFloat();

double result = number * 0.454;

System.out.printf("The %.3f pounds is %.3f kilograms", number, result);
}

}