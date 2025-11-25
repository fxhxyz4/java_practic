public class SportCar extends Car {
    public SportCar(String model, int maxSpeed, double fuelConsumption, int price) {
        super(model, maxSpeed, fuelConsumption, price);
    }

    @Override
    public void info() {
        System.out.println("Спортивний автомобіль: " + model);
    }
}
