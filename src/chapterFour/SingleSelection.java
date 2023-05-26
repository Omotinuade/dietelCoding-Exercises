package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number > 10){
            System.out.println("It is out of range");
        }
        else {if (number%2 ==0){
            System.out.println("It is even");
        }
            else{
            System.out.println("It is odd");
        }
        }
    }
}
