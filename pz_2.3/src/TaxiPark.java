import java.util.Arrays;
import java.util.Comparator;

public class TaxiPark {
    private Car[] cars;
    private int count = 0;

    public TaxiPark() {}

    public TaxiPark(int size) {
        cars = new Car[size];
    }

    public void addCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        }
    }

    public int totalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < count; i++) {
            totalPrice += cars[i].getPrice();
        }

        return totalPrice;
    }

    public int totalCargo() {
        int totalCargo = 0;

        for(int i = 0; i < count; i++) {
            if (cars[i] instanceof Truck truck) {
                totalCargo += truck.getCargoCapacity();
            }
        }

        return totalCargo;
    }

    public int totalPassengers() {
        int totalPassengers = 0;

        for(int i = 0; i < count; i++) {
            if (cars[i] instanceof PassengerCar p) {
                totalPassengers += p.getPassengers();
            }
        }

        return totalPassengers;
    }

    public void sortByFuelConsumption() {
        Arrays.sort(cars, 0, count, Comparator.comparingDouble(Car::getFuelConsumption));
    }

    public void findByMaxSpeed(int speed) {
        for (int i = 0; i < count; i++) {
            if (cars[i].getMaxSpeed() == speed) {
                cars[i].info();
            }
        }
    }
}
