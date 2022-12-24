import java.util.ArrayList;

public class CashierOrder {

    private String cashierName;
    private String customerName;
    private double itemTotalPrice;
    private double discountPrice;
    private double discounted;
    private final double VAT= 7.5;
    private double amountVAT;
    private double billTotal;
    private double balance;
    private double paid;
    private ArrayList<CustomerOrder> customerOrders;

    public CashierOrder() {
        this.customerOrders = new ArrayList<CustomerOrder>();
    }

    public ArrayList<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }
    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
    public String getCashierName() {
        return cashierName;
    }
    public void  setCustomerOrder(CustomerOrder customerOrder){
        customerOrders.add(customerOrder);
        this.itemTotalPrice+=customerOrder.getTotalPrice();
    }

    public void addCustomerName(String customerName){
        this.customerName= customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getItemTotalPrice() {
        return itemTotalPrice;
    }
    public double getDiscountPrice() {
        return discountPrice;
    }
    public double getAmountVAT() {
        return amountVAT;
    }

    public void calculateDiscount(double discount){
         discounted = (discount/100) * itemTotalPrice;
        discountPrice= discounted;
    }

    public double getBillTotal() {
        return billTotal;
    }

    public void calculateVAT(){
        amountVAT = (VAT/100) * itemTotalPrice;
        billTotal= itemTotalPrice - discounted+amountVAT;
    }
    public void calculateBalance(double paid){
        balance = paid -billTotal;
    }
    public double getBalance() {
        return balance;
    }
}
