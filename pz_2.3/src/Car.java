import Data.CategoryList;
import java.math.BigInteger;
import java.time.Year;

public class Car {
    private String model;
    private String category;
    private Year releaseYear;
    private BigInteger price = BigInteger.ZERO;

    private boolean isTrueCategory = false;

    public Car() {}

    public Car(String model, String category,  Year releaseYear, BigInteger price) {
        this.model = model;
        isTrueCategory = CategoryList.checkCategory(category);

        this.releaseYear = releaseYear;
        this.price = price;
    }

}
