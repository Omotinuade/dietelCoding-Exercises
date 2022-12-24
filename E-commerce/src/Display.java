import java.time.LocalDateTime;

public class Display {
    public static void display(CashierOrder cashierOrder) {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.printf("Date: %s%n", LocalDateTime.now().toLocalDate());
        System.out.printf("Cashier: %s%n", cashierOrder.getCashierName());
        System.out.printf("Customer's name: %s%n", cashierOrder.getCustomerName());
        System.out.println("=".repeat(100));
        System.out.printf("%24s%22s%24s%30s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-".repeat(100));
        System.out.println();
        for (var customerOrder: cashierOrder.getCustomerOrders()){
            System.out.printf("%24s%22s%24s%30s%n", customerOrder.getItemName(),customerOrder.getQuantity(),customerOrder.getPrice(),customerOrder.getTotalPrice() );
        }

        System.out.println("-".repeat(100));

        System.out.printf("%60s%30.2f%n",("Subtotal: "), cashierOrder.getItemTotalPrice());
        System.out.printf("%60s%30.2f%n",("Discount: "), cashierOrder.getDiscountPrice());
        System.out.printf("%60s%30.2f%n",("VAT @ 7.5%% : "), cashierOrder.getAmountVAT());

        System.out.println("=".repeat(100));
        System.out.printf("%60s%30.2f%n",("Bill Total: "), cashierOrder.getBillTotal());


    }
    public static void display2(CashierOrder cashierOrder){
        display(cashierOrder);
        System.out.printf("%60s%30.2f%n",("Amount Paid: "), cashierOrder.getPaid());
        System.out.printf("%60s%30.2f%n",("Balance: "), cashierOrder.getBalance());
        System.out.println("=".repeat(100));
        System.out.printf("%25s%n", "THANK YOU FOR YOUR PATRONAGE");
        System.out.println("=".repeat(100));



    }
}
