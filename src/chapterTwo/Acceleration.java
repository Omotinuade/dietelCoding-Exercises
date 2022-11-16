package chapterTwo;

import java.util.Scanner;

public class Acceleration{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter v, v1, and t respectively : ");

double v = scan.nextDouble();

double v1 = scan.nextDouble();

double t = scan.nextDouble();

double averageAcceleration = (v1 - v)/t;

System.out.println("The average acceleration is " +averageAcceleration);





}

}