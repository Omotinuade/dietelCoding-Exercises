package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

   @Test
    public void setCurrentState(){
        AirConditioner myAC = new AirConditioner();
          assertFalse(false);
    }
    @Test
    public void turnItOn(){
        AirConditioner myAC = new AirConditioner();
          myAC.acSwitch(true);
         assertTrue(myAC.checkStatus());
    }
@Test
    public void turnItOff(){
    AirConditioner myAC = new AirConditioner();
    myAC.acSwitch(true);
    myAC.acSwitch(false);
    assertFalse(myAC.checkStatus());
}
@Test
    public void increaseTemperature(){
    AirConditioner myAC = new AirConditioner();
    myAC.acSwitch(true);
    int initialTemp = myAC.checkTemperature();
    myAC.acTemperatureIncrease();
    int finalTemp = myAC.checkTemperature();
    assertTrue(finalTemp> initialTemp);

}
    @Test
    public void decreaseTemperature(){
        AirConditioner myAC = new AirConditioner();
        myAC.acSwitch(true);
        int initialTemp = myAC.checkTemperature();
        myAC.acTemperatureDecrease();
        int finalTemp = myAC.checkTemperature();
        assertTrue(finalTemp< initialTemp);

    }

}