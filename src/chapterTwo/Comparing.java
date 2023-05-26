package chapterTwo;

import java.util.Scanner;

public class Comparing{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");

				int a = input.nextInt();

					int squareA = a * a;
							
		if (a == 100) {
			
			System.out.printf("%d == %d%n", a, 100 );
}
		if (squareA == 100) {
			
			System.out.printf("%d == %d%n", squareA, 100);
}

		if (a != 100) {
			
			System.out.printf("%d != %d%n", a, 100);
}
		if (squareA != 100) {
			
			System.out.printf("%d != %d%n", squareA, 100);
}
		if (a < 100) {
			
			System.out.printf("%d < %d%n", a, 100);
}
		if (squareA < 100) {
			
			System.out.printf("%d < %d%n", squareA, 100);
}

	if (a > 100) {
			
			System.out.printf("%d > %d%n", a, 100);
}
		if (squareA > 100) {
			
			System.out.printf("%d > %d%n", squareA, 100);
}


}
}