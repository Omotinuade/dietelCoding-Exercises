package chapterTwo;

import java.util.Scanner;

public class Years{

public static void main(String[] args){

Scanner enter = new Scanner(System.in);

System.out.print("Enter the minutes: ");

int minutes = enter.nextInt();

int years = minutes / (60* 24 * 365);

int yearsRemainder = (minutes / (60* 24)) % (365);




System.out.printf("%d is approximately %d years and %d days", minutes, years, yearsRemainder);

}
}