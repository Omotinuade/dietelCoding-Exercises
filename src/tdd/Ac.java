package tdd;

public class Ac {
    private boolean status;
    private int temperature;

    public void turnOnAndOff (boolean powerOn) {
        status = powerOn;
    }

    public boolean getStatus() {
        return status;
    }

    public void increaseTemperature(int newTemperature) {
    this.temperature = newTemperature;
if (temperature < 30){
      temperature++;}


    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int newTemperature) {
        this.temperature = newTemperature;
        if (temperature > 16)
        temperature--;
    }
}
