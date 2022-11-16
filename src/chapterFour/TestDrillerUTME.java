package chapterFour;

public class TestDrillerUTME {


    public int calculatePrice(int noOfCopies) {
        int totalPrice ;
       // if (noOfCopies < 1) totalPrice = 0;
        if (noOfCopies > 0 && noOfCopies <= 4) {totalPrice = noOfCopies * 2000;}
        else if (noOfCopies <= 9) {totalPrice = noOfCopies * 1800;}
        else if (noOfCopies <=29) {totalPrice = noOfCopies * 1600;}
        else if (noOfCopies <=49) {totalPrice = noOfCopies * 1500;}
        else if (noOfCopies <= 99) {totalPrice = noOfCopies * 1300;}
        else if (noOfCopies <= 199) {totalPrice = noOfCopies * 1200;}
        else if (noOfCopies <= 499) {totalPrice = noOfCopies * 1100;}
        else {totalPrice = noOfCopies * 1000;}
        return totalPrice;
    }
}
