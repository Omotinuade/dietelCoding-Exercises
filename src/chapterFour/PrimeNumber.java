package chapterFour;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for (int i = 2; i<= number; i++){
           if ((number % i == 1) || (number == 2))
               System.out.println(number +" is a prime number");
           else
               System.out.println(number + " is not a prime number");
           break;
        }
    }
}
