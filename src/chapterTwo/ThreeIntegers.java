package chapterTwo;

import java.util.Scanner;

public class ThreeIntegers{

	public static void main (String [] args){

		Scanner scan = new Scanner(System.in);

			System.out.println("Enter first integer:");

				int firstInteger = scan.nextInt();

			System.out.println("Enter second integer:");

				int secondInteger = scan.nextInt();

			System.out.println("Enter third integer:");

				int thirdInteger = scan.nextInt();

				int sum = firstInteger + secondInteger + thirdInteger;
					
				int average = ((firstInteger + secondInteger + thirdInteger) / 3);

				int product = firstInteger * secondInteger * thirdInteger;

		
			System.out.printf("The Sum is %d%n The Product is %d%nThe Average is %d%n",sum, product, average);

				if (firstInteger > secondInteger && firstInteger > thirdInteger) {

			System.out.printf("The largest number is %d%n", firstInteger );
}
				
				if (secondInteger > firstInteger && secondInteger > thirdInteger) {

			System.out.printf("The largest number is %d%n", secondInteger );
}
				

				if (thirdInteger > firstInteger &&  thirdInteger > secondInteger ) {

			System.out.printf("The largest number is %d%n", thirdInteger );
}

				if (firstInteger < secondInteger &&  firstInteger < thirdInteger ) {

			System.out.printf("The smallest number is %d%n", firstInteger );
}


				if (secondInteger < firstInteger &&  secondInteger < thirdInteger ) {

			System.out.printf("The smallest number is %d%n", secondInteger );
}

				if (thirdInteger < firstInteger &&  thirdInteger < secondInteger ) {

			System.out.printf("The smallest number is %d%n", thirdInteger );
}
				
}



}