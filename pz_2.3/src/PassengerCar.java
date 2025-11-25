public class PassengerCar extends Car {
    private int passengers;

    public PassengerCar(String model, int maxSpeed, double fuelConsumption, int price, int passengers) {
        super(model, maxSpeed, fuelConsumption, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public void info() {
        System.out.println("Легковий автомобіль: " + model);
    }
}
