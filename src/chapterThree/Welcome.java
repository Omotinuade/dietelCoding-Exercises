package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name here: ");
     String herName = userInput.nextLine();
        Native tinuade = new Native();
        tinuade.setName(herName);
        String myName = tinuade.getName();
       System.out.println(myName);
        System.out.println();
    }
}
