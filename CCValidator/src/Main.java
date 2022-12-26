import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter your card details: ");
        String cardNumber = input.next();
        CreditCard creditCard= new CreditCard(cardNumber);
        creditCard.setOddSum();
       int getOddSum= creditCard.getOddSum();
      creditCard.setEvenSum();
       int getEvenSum= creditCard.getEvenSum();
        int sum= creditCard.getOddSum() + creditCard.getEvenSum();
        if (sum % 10 == 0){
      creditCard.setValidityStatus("Valid");
    }
        else {creditCard.setValidityStatus("Invalid");
    }
    Display.display(creditCard);
    }
}