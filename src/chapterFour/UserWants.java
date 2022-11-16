package chapterFour;

import java.util.Scanner;

public class UserWants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to compare: ");
        int limit  = input.nextInt();
        int i = 0;
        int smallest_Number = 0;
        int largestNumber = 0;
        for (i= 0;i < limit; ){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            //int largestNumber = 0;
            if (num > largestNumber){
                int temp = largestNumber;
                largestNumber = num;



            }i++;
        }
        System.out.println("The largest number is " + largestNumber);
    }
}
