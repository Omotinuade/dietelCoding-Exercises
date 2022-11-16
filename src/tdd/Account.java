package tdd;

public class Account {
    private int balance;
    private String pin = "1234";


    public void deposit(int amount) {
       if(amount > 0) {
            balance = balance + amount;
        }
    }


    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount,String pin) {
        int minimumBalance = 500;
        if(pin.equals(this.pin)) {
            if (amount < balance - minimumBalance && amount > 0) {
                balance = balance - amount;
            } else {
                amount = 0;
                balance = balance - amount;
            }
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

