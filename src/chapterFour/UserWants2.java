package chapterFour;

import java.util.Scanner;

public class UserWants2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double largestNumber = 0;
         double smallestNumber = 0;
        System.out.println("Enter a number or  0 to quit");
        double number = input.nextDouble();
    while (number != 0){
            if (number > largestNumber){
                double temp = largestNumber;
                largestNumber = number;
             }
        if (number < smallestNumber){
             double temp = smallestNumber;
            smallestNumber = number;}
        System.out.println("Enter a number or  0 to quit");
        number = input.nextDouble();}
    System.out.println("The largest Number is " +largestNumber+ "  and the smallest number is " + smallestNumber);

    }
}
