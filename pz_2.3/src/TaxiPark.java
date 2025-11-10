import java.math.BigInteger;

public class TaxiPark {
    private Car[] cars;
    private int count = 0;

    private BigInteger allPrice;

    public TaxiPark() {}

    public TaxiPark(int size) {
        cars = new Car[size];
        count = size;
    }

    public void AddCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        }
    }

}
