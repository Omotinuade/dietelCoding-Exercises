package chapterThree;

import java.util.Scanner;

public class Numbers{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.printf ("%d is an even number", number);
        }
else {
    System.out.printf ("%d is an odd number", number);
        }
    }

}
