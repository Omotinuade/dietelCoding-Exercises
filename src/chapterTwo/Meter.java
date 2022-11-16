package chapterTwo;

import java.util.Scanner;

public class Meter{

public static void main(String[] args){

Scanner enter = new Scanner(System.in);

System.out.print("Enter number in feets");

double feet = enter.nextDouble();

double meters = feet * 0.305;

System.out.printf("%.2f feet is %.2f meters", feet, meters);

}
}