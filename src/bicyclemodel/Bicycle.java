package bicyclemodel;

public class Bicycle {
    private double direction;
    private double speed = 0;
    private final double drag; 
    private final double pedalPower;
    private final double brakingPower;

    public Bicycle(double drag, double pedalPower, double brakingPower) {
        this.drag = drag;
        this.pedalPower = pedalPower;
        this.brakingPower = brakingPower;
    }
    public Bicycle() {
        this(0.1,2,3);
    }

    public double getDirection() {
        return direction;
    }
    public void setDirection(double direction) {
        if (direction > 90 ) {
            this.direction = 90;
        } else if (direction < -90) {
            this.direction = -90;
        } else {
            this.direction = direction;
        }
    }
    public double getSpeed() {
        return speed;
    }
    public void pedalHarder() {
        speed = (speed + pedalPower) * (1 -drag);
    }
    public void brake() {
        speed = (speed - brakingPower) * (1 - drag);
        if (speed < 0) {
            speed = 0;
        }
    }

}
