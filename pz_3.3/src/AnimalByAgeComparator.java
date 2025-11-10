import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.util.Comparator;

public class AnimalByAgeComparator implements Comparator<PetAnimal> {
    private final Order order;
    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(PetAnimal a1, PetAnimal a2) {
        if (order == Order.ASCENDING) {
            return Integer.compare(a1.getAge(), a2.getAge());
        } else {
            return Integer.compare(a2.getAge(), a1.getAge());
        }
    }
}
