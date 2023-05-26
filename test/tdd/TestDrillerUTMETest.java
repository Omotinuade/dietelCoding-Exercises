package tdd;

import chapterFour.TestDrillerUTME;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDrillerUTMETest {

    @Test
    public void calculatePriceForLessThanOneCopyTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(0);
        assertEquals(0, totalPrice);
    }

    @Test
    public void calculatePriceForOneToFourCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(2);
        assertEquals(4000, totalPrice);
    }
    @Test
    public void calculatePriceForFiveToNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(-4);
        assertEquals(9000, totalPrice);
    }
    @Test
    public void calculatePriceForTenToTwentyNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(29);
        assertEquals(46400, totalPrice);
    }
    @Test
    public void calculatePriceForThirtyToFortyNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(30);
        assertEquals(45000, totalPrice);
    }
    @Test
    public void calculatePriceForFiftyToNinetyNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(50);
        assertEquals(65000, totalPrice);
    }
    @Test
    public void calculatePriceForAHundredToOneNinetyNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(199);
        assertEquals(238800, totalPrice);
    }
    @Test
    public void calculatePriceForTwoHundredToFourNinetyNineCopiesTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(499);
        assertEquals(548900, totalPrice);
    }
    @Test
    public void calculatePriceForFiveHundredCopiesAboveTest(){
        TestDrillerUTME app = new TestDrillerUTME();
        int totalPrice = app.calculatePrice(599);
        assertEquals(599000, totalPrice);
    }
}