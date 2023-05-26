package chapterTwo;

import java.util.Scanner;

public class Energy{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");

double m = scan.nextDouble();

System.out.print("Enter the initial temperature of water: ");

double initialTemperature = scan.nextDouble();

System.out.print("Enter the final temperature of water: ");

double finalTemperature = scan.nextDouble();

double q = m * (finalTemperature - initialTemperature) * 4184;

System.out.print("The energy needed is" +q);

}
}