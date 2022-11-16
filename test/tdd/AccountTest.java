package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {
        // given there is an account
        Account estherAccount = new Account();

        // when i deposit 50000
        estherAccount.deposit(50000);

        // check that balance is 50000
        int estherAccountBalance = estherAccount.getBalance();

        assertEquals(50000, estherAccountBalance);

    }

    @Test
    public void depositTwiceTest() {
        // given there is an account
        Account estherAccount = new Account();
        // given that initial balance is 4000
        estherAccount.deposit(4000);
        // when i deposit 2000
        estherAccount.deposit(2000);
        //check that balance is 6000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(6000, estherAccountBalance);
    }

    @Test
    public void depositNegativeAmountTest() {
        // given there is an account
        Account estherAccount = new Account();
        // given that initial balance is 4000
        estherAccount.deposit(4000);
        // when I deposit -2000
        estherAccount.deposit(-2000);
        //check that balance is 2000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(4000, estherAccountBalance);
    }

    @Test
    public void withdrawTest() {
        // given that there is an account
        Account estherAccount = new Account();
        // given that the initial balance of 5000
        estherAccount.deposit(5000);
        //when I want to withdraw 3000
        estherAccount.withdraw(3000, "1234");
        // check that balance is 2000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(2000, estherAccountBalance);

    }

    @Test
    public void higherWithdrawalAmountTest() {
        // given that there is an account
        Account estherAccount = new Account();
        // given that the initial balance of 5000
        estherAccount.deposit(5000);
        //when I want to withdraw 8000
        estherAccount.withdraw(8000,"1234");
        // check that balance is 5000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(5000, estherAccountBalance);

    }

    @Test
    public void withdrawalAtZeroBalance() {
        // given that there is an account
        Account estherAccount = new Account();
        // given that the initial balance of 0
        estherAccount.deposit(0);
        //when I want to withdraw 8000
        estherAccount.withdraw(8000, "1234");
        // check that balance is 0
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(0, estherAccountBalance);
    }

    @Test
    public void withdrawANegativeAmountTest() {
        // given that there is an account
        Account estherAccount = new Account();
        //when I want to withdraw -800
        estherAccount.withdraw(-800, "1234");
        // check that balance is 5000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(0, estherAccountBalance);
    }

    @Test
    public void withdrawWhenLimitIsSurpassedTest() {
        // given that there is an account
        Account estherAccount = new Account();
        // given that the initial balance of 5000
        estherAccount.deposit(5000);
        //when I want to withdraw 8000
        estherAccount.withdraw(8000, "1234");
        // check that balance is 5000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(5000, estherAccountBalance);
    }
    @Test
    public void noWithdrawLessThanMinimumBalanceTest(){
        Account estherAccount = new Account();
        // given that the initial balance of 5000
        estherAccount.deposit(5000);
        //when I want to withdraw 8000
        estherAccount.withdraw(4700, "1234");
        // check that balance is 5000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(5000, estherAccountBalance);
    }
    @Test
    public void withdrawalWithWrongPinFailTest(){
        // given that there is an account
        Account estherAccount = new Account();
        // there is a set pin of 9876 in order to withdraw
        estherAccount.setPin ("9876");
        // given that the initial balance of 5000
        estherAccount.deposit(5000);
        //when I want to withdraw 3000
        estherAccount.withdraw(3000, "9876");
         // check that balance is 5000
        int estherAccountBalance = estherAccount.getBalance();
        assertEquals(2000, estherAccountBalance);
    }
}