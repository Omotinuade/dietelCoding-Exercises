public class Display {
    public static void display(CreditCard creditCard){
        System.out.println("*".repeat(50));
        System.out.printf("**Credit Card Type: %s%n",creditCard.getCardType());
        System.out.printf("**Credit Card Number: %s%n", creditCard.getCardNumber());
        System.out.printf("**Credit Card Digit Length: %d%n ", creditCard.getCardLength());
        System.out.printf("**Credit Card Validity Status: %s%n", creditCard.getValidityStatus());
        System.out.println("*".repeat(50));

    }
}
