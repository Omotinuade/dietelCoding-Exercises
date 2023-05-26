package chapterFour;

import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int largestNumber= number;
        int smallestNumber = number;
        while (number != 0){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number > largestNumber)
                largestNumber = number;
            if (number < smallestNumber)
                smallestNumber = number;
        }
        System.out.println("The smallest number is "+ smallestNumber+ " and the largest number is "+ largestNumber);
    }
}
