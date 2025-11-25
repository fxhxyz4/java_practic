public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected double fuelConsumption;
    protected int price;

    public Car(String model, int maxSpeed, double fuelConsumption, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;

        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void info();
}
