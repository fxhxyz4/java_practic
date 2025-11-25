public class Truck extends Car {
    private int cargoCapacity;

    public Truck(String model, int maxSpeed, double fuelConsumption, int price, int cargoCapacity) {
        super(model, maxSpeed, fuelConsumption, price);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void info() {
        System.out.println("Вантажний автомобіль: " + model);
    }
}
