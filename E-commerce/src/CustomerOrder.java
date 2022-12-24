public class CustomerOrder {

    private String itemName;
    private int quantity;
    private double price;
    private double paid;
    private String cashierName;
    private  double totalPrice;


    public CustomerOrder(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice=this.price * this.quantity;

    }
public double getTotalPrice(){
        return totalPrice;
}

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCashierName() {
        return cashierName;
    }
    public double getPaid() {return paid;}
}
