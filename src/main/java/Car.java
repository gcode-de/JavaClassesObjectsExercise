import org.w3c.dom.ls.LSOutput;

public class Car extends Vehicle {
    private boolean isConvertible;
    private boolean isRunning;
    private int speed;
    private int doorsCount;

    public Car(String manufacturer, String model, int yearOfManufacture) {
        super(manufacturer, model, yearOfManufacture);
    }

    public Car(String manufacturer, String model, int yearOfManufacture, boolean isConvertible, boolean isRunning, int speed, int doorsCount) {
        super(manufacturer, model, yearOfManufacture);
        this.isConvertible = isConvertible;
        this.isRunning = isRunning;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedInMiles() {
        return (int) Math.round(speed / 1.609);
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
        if (isRunning) {
            System.out.println("Car is running!");
        } else {
            System.out.println("Car is NOT running!");
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", doorsCount=" + doorsCount +
                ", speed=" + speed +
                ", isRunning=" + isRunning +
                ", isConvertible=" + isConvertible +
                '}';
    }
}
