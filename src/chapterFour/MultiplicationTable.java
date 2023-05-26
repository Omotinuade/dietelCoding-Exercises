package chapterFour;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Enter a number: ");
        int number = input.nextInt();
        int count = 0;
        while (count < 12) {
            count++;
            int result  = number * count;
            System.out.println(number + " times " + count + " is " +result);
        }

    }
}
