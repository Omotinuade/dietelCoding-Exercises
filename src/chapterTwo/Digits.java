package chapterTwo;

import java.util.Scanner;

	public class Digits{

		public static void main(String[] args){

			Scanner scan = new Scanner(System.in);

		System.out.print("Kindly input number:");

			int number = scan.nextInt();
			
			int digit1 = number / 10000 % 10;

			int digit2 = number / 1000 % 10;

			int digit3 = number / 100 % 10;

			int digit4 = number / 10 % 10;

			int digit5 = number / 1 % 10;

		System.out.printf("%d   %d   %d   %d   %d", digit1, digit2, digit3, digit4, digit5);


}

}