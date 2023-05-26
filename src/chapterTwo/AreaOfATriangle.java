package chapterTwo;

import java.util.Scanner;

import java.lang.Math;

	public class AreaOfATriangle{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter x1, x2, x3, y1, y2, y3 respectively : ");

			double x1 = scan.nextDouble();

			double x2 = scan.nextDouble();

			double x3 = scan.nextDouble();

			double y1 = scan.nextDouble();

			double y2 = scan.nextDouble();

			double y3 = scan.nextDouble();

	double side1 = Math.sqrt(Math.pow (x3- x1, 2) + Math.pow( y3- y1, 2));

	double side2 = Math.sqrt(Math.pow (x2- x1, 2) + Math.pow( y2- y1, 2));

	double side3 = Math.sqrt(Math.pow( x3- x2, 2) + Math.pow( y3- y2, 2));

	double s = (side1 + side2 + side3)/2;

double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

System.out.printf("The area of the triangle is %.1f", area);

}
}