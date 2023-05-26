package tdd;

public class Bike {
    private boolean power;
    private int gear;
    private int velocity;

    public Bike(){
        power= false;
         }
    public void powerOnAndOff(boolean power) {
        this.power = power;
        if (power) {
            this.velocity = 0;
        }
    }

    public boolean getPowered(boolean power) {
        return power;
    }

    public void accelerateBike(int gearNumber) {
        if(gearNumber == 1 && this.velocity <= 20) this.velocity++;
        if(gearNumber ==2 && this.velocity > 20 && this.velocity <=30) this.velocity+=2;
        if(gearNumber == 3 && this.velocity >30 &this.velocity<=40) this.velocity+=3;
        if(gearNumber == 4 && this.velocity>40) this.velocity+=4;
        automaticChange();
        }
    public void decelerateBike(int gearNumber) {
        if(gearNumber == 1 && this.velocity <= 20) this.velocity--;
        if(gearNumber ==2 && this.velocity > 20 && this.velocity <=30) this.velocity-=2;
        if(gearNumber == 3 && this.velocity >30 &this.velocity<=40) this.velocity-=3;
        if(gearNumber == 4 && this.velocity>40) this.velocity-=4;
        automaticChange();
    }

public void automaticChange(){
       if (this.velocity <= 20) this.gear =1;
    if (this.velocity > 20 && this.velocity <=30) this.gear =2;
    if (this.velocity > 30 && this.velocity <= 40) this.gear =3;
    if (this.velocity > 40) this.gear =4;
}
public void manualSpeedChange(int velocity){
        this.velocity+= velocity;
        automaticChange();
}
    public int getVelocity() {
        return this.velocity;
    }
    public int getGear(){
        return this.gear;
    }
}

