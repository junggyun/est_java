package day0612;

public class Car {
    private int speed;
    private int gear; //1~3
    private String wheel;
    private int cc;
    private String logo;
    private String engine;

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            setGear(1);
            this.speed = 0;
            return;
        } else if (speed <= 30) {
            setGear(1);
        } else if (speed <= 70) {
            setGear(2);
        } else if (speed <= 120) {
            setGear(3);
        } else {
            setGear(3);
            this.speed = 120;
            return;
        }
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
