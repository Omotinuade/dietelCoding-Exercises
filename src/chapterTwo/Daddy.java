package chapterTwo;

import java.util.Scanner;

public class Daddy{

public static void main(String[] args){

Scanner daddy = new Scanner(System.in);

System.out.print("Enter your age please: ");

int age = daddy.nextInt();

if ( age >= 62) {

System.out.printf("Welcome daddy, your age is %d and you are so loved by your children especially Toyin", age);


}

else {

System.out.printf("Welcome mummy, your age is %d and you are so loved by your children especially Toyin", age);

}

}

}