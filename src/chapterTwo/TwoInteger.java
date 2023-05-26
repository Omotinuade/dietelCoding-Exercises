package chapterTwo;

import java.util.Scanner;

public class TwoInteger{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");

int firstInteger = input.nextInt();

System.out.print("Enter the second number: ");

int secondInteger = input.nextInt();

int sum = firstInteger + secondInteger;

System.out.println(firstInteger+" + " +secondInteger+ "=" +sum);

int subtract = firstInteger - secondInteger;

System.out.println(firstInteger+" - " +secondInteger+ "=" +subtract);

int multiply = firstInteger * secondInteger;

System.out.println(firstInteger+" * " +secondInteger+ " = " +multiply);

double divide = firstInteger / (secondInteger *1.0);

System.out.println(firstInteger+" / " +secondInteger+ " = " +divide);

int remainder = firstInteger % secondInteger;

System.out.println(firstInteger+" mod " +secondInteger+ " = " +remainder);

}
}

