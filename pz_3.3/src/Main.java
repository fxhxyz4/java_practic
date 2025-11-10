import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Main {
     static void main(String[] args) {
        Cat cat1 = new Cat("мурка", LocalDate.of(2018, 5, 12));
        Cat cat2 = new Cat("барсик", LocalDate.of(2012, 5, 12));
        Cat cat3 = new Cat("барсик", LocalDate.of(2012, 5, 12));

        List<Cat>  cats = new ArrayList<Cat>(List.of(cat1, cat2,cat3));
        cats.sort(new AnimalByAgeComparator(Order.ASCENDING));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println("\n\n");

        Dog dog1 = new Dog("Бобик", LocalDate.of(2015, 4, 10));
        Dog dog2 = new Dog("Шарик", LocalDate.of(2018, 7, 5));
        Dog dog3 = new Dog("Тузик", LocalDate.of(2016, 1, 20));

        List<Dog> dogs = new ArrayList<Dog>(List.of(dog1, dog2,dog3));
        dogs.sort(new AnimalByAgeComparator(Order.ASCENDING));


        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("\n\n");

        List<PetAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);

        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));

        for  (PetAnimal animal : rancho) {
            System.out.println(animal.typeAge());
        }
    }
}