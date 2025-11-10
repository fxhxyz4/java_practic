import java.time.LocalDate;
import java.util.Random;

public class Dog extends PetAnimal  {
    public int scaredAwayThievesCount;
    private static final Random random = new Random();


    public Dog(){}

    public Dog(int scaredAwayThievesCount){
        this.scaredAwayThievesCount = scaredAwayThievesCount;
    }

    public Dog(String name, LocalDate date)
    {
        super(name, date);
        this.scaredAwayThievesCount = random.nextInt(getAge() * getAge() + 1);
    }

    @Override
    void sleep() {
        System.out.println("The dog is sleeping.");
    }

    @Override
    void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Dog" + " " + getName() + " " + "scared away " + scaredAwayThievesCount + " thieves";
    }
}
