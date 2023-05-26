package chapterTwo;

import java.util.Scanner;

public class TwoIntegers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");

int firstInteger = input.nextInt();

System.out.print("Enter the second integer: ");

int secondInteger = input.nextInt();

int sum = firstInteger + secondInteger;

System.out.println("Sum of two integer is " +sum);

int difference = firstInteger - secondInteger;

System.out.println("Difference of two integer is " +difference);

int product = firstInteger * secondInteger;

System.out.println("Product of two integer is " +product);

double average = sum / 2.0;

System.out.println("Average of two integer is " +average);

int distance = difference;

System.out.println("Distance of two integer is " +distance);

if (firstInteger > secondInteger) {

System.out.println("The max integer is " +firstInteger);
}

else {

System.out.println("The min integer is " +firstInteger);
}

if ( secondInteger > firstInteger) {

System.out.println("The max integer is " +secondInteger);
}

else {

System.out.println("The min integer is " +secondInteger);
}
}
}



