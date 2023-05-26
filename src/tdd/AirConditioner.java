package tdd;

public class AirConditioner {
private int temperature;
private boolean status;
    public AirConditioner() {
            status = false;
    }

    public void acSwitch(boolean powerOn) {
        status = powerOn;
        if (powerOn){
        temperature = 25;}
            }


    public void acTemperatureIncrease() {
        if (temperature < 30) {
            temperature++;
        }


          }
    public void acTemperatureDecrease() {
        if (temperature > 16) {
            temperature--;
        }
    }
    public boolean checkStatus(){
        return status;
    }
    public int checkTemperature(){
        return temperature;
    }
}
