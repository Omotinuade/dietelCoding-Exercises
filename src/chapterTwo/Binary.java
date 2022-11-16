package chapterTwo;

import java.util.Scanner;

	public class Binary{

		public static void main(String[] args){

			Scanner userInput = new Scanner(System.in);

			System.out.print("Input a number: ");

				int number = userInput.nextInt();

			if (number == 1) {

			System.out.println("0");

}

			if (number == 0) {

			System.out.println("1");

}

	if (number != 0 && number != 1) {

			System.out.println("Kindly enter a number, 0 or 1 !");

}

}


}