package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bikeTurnedOnTest(){
        Bike myBike = new Bike();
        myBike.powerOnAndOff(true);
        assertTrue(myBike.getPowered(true));
    }
    @Test
public void bikeTurnedOffTest(){
    Bike myBike = new Bike();
    myBike.powerOnAndOff(true);
    myBike.powerOnAndOff(false);
    assertFalse(myBike.getPowered(false));
}
@Test
    public void canBeAcceleratedTest(){
    Bike myBike = new Bike();
    myBike.powerOnAndOff(true);
    int initialGear = myBike.getVelocity();
     myBike.accelerateBike(1);
int finalGear = myBike.getVelocity();
    assertTrue(finalGear> initialGear);
}

@Test
public void canBeDeceleratedTest(){
    Bike myBike = new Bike();
    myBike.powerOnAndOff(true);
    int initialGear = myBike.getVelocity();
    myBike.decelerateBike(1);
    int finalGear = myBike.getVelocity();
    assertTrue(finalGear < initialGear);
}
@Test
    public void automaticChangeGearTest(){
    Bike myBike = new Bike();
    myBike.powerOnAndOff(true);
    myBike.manualSpeedChange(40);
    int gear = myBike.getGear();
    int expectedGear= 3;
       assertEquals(gear, expectedGear);
}
}
