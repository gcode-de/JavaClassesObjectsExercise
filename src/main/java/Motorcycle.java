public class Motorcycle extends Vehicle {
    private String type;
    private boolean isRunning;
    private int speed;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture) {
        super(manufacturer, model, yearOfManufacture);
    }

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type, boolean isRunning, int speed) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
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
        return "Motorcycle{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", speed=" + speed +
                ", isRunning=" + isRunning +
                ", type='" + type + '\'' +
                '}';
    }
}
