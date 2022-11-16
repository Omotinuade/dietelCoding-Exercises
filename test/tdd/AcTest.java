package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
    @Test
    public void turnItOnTest(){
        Ac myAc = new Ac();
        myAc.turnOnAndOff (true);
        myAc.getStatus();
        assertTrue(myAc.getStatus());  }
    @Test
    public void turnItOffTest(){
        Ac myAc = new Ac();
        myAc.turnOnAndOff (true);
        myAc.turnOnAndOff (false);
        myAc.getStatus();
        assertFalse(myAc.getStatus());
    }
   @Test
    public void increaseTemperatureTest(){
       Ac myAc = new Ac();
       myAc.turnOnAndOff (true);
       myAc.increaseTemperature(25);
       int myAcTemperature = myAc.getTemperature();
       assertEquals(26, myAcTemperature);
   }
    @Test
    public void decreaseTemperatureTest(){
        Ac myAc = new Ac();
        myAc.turnOnAndOff (true);
        myAc.decreaseTemperature(25);
        int myAcTemperature = myAc.getTemperature();
        assertEquals(24, myAcTemperature);
    }
@Test
    public void temperatureCannotIncreaseBeyond30(){
        Ac myAc = new Ac();
        myAc.turnOnAndOff(true);
        myAc.increaseTemperature(30);
    int myAcTemperature = myAc.getTemperature();
    assertEquals(30, myAcTemperature);

}
    @Test
    public void temperatureCannotDecreaseBelow16(){
        Ac myAc = new Ac();
        myAc.turnOnAndOff(true);
        myAc.decreaseTemperature(16);
        int myAcTemperature = myAc.getTemperature();
        assertEquals(16, myAcTemperature);

    }
}
