import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Semicolon Stores!");
        System.out.println("=".repeat(70));
        System.out.println("""
                Pick a menu;
                1. To purchase an item
                2. Checkout
                3. Exit""");

        int menu = input.nextInt();
        boolean result = Validator.menuInput(menu);
        while (!result){
            System.out.println("Invalid menu option selected!");
            System.out.println("""
                Pick a menu;
                1. To purchase an item
                2. Checkout
                3. Exit""");
            menu = input.nextInt();
            result = Validator.menuInput(menu);
        }
        if (menu ==1){
            System.out.println("""
                Enter 1 to add an item;
                1. Add an item
                2. Back""");
            int add = input.nextInt();
            boolean addResult= Validator.addItem(add);
            System.out.println("Enter Customer's Name");
            String customerName = input.next();
            var cashierOrder = new CashierOrder();
            cashierOrder.addCustomerName(customerName);
            while (add==1){
                System.out.println("What did the user buy?");
                String item = input.next();
                System.out.println("How many pieces?");
                int quantity = input.nextInt();
                System.out.println("How much per units?");
                double price = input.nextDouble();

                CustomerOrder customerOrder = new CustomerOrder(item,quantity,price);
                cashierOrder.setCustomerOrder(customerOrder);

                System.out.println("Add more items?");
                 String reply = input.next();
                 if(reply.equalsIgnoreCase("no"))break;
            }

            System.out.println("What is your Name? ");
            String cashierName = input.next();
            cashierOrder.setCashierName(cashierName);
            System.out.println("How much discount will the customer get? ");
            double discount = input.nextDouble();
            cashierOrder.calculateDiscount(discount);
            cashierOrder.calculateVAT();
            Display.display(cashierOrder);
            System.out.printf("%10s%.2f%n","THIS IS NOT A RECEIPT, KINDLY PAY ", cashierOrder.getBillTotal());
            System.out.println("=".repeat(100));
            System.out.println();
            System.out.println("How much did the customer give to you?");
            double paid = input.nextDouble();
            cashierOrder.setPaid(paid);
            cashierOrder.calculateBalance(paid);
            Display.display2(cashierOrder);

        }

    }
}