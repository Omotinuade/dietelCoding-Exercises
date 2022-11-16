package chapterFour;

import java.util.Scanner;

public class Factor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            int i =1;
            int total = 0;
        while(i <= number) {
            if ((number % i) == 0){
                total++;}

            i++;}

        System.out.println(number + " has "+ total+ " factors");

        }}