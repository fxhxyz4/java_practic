import javax.naming.Name;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

class Cat extends PetAnimal {
    public int caughtMiceCount;
    private static final Random random = new Random();

    public Cat() {
    }

    public Cat(String name,  LocalDate date)
    {
        super(name, date);
        this.caughtMiceCount = random.nextInt(getAge() * getAge() + 1);
    }

    public Cat(int caughtMiceCount, String name,  LocalDate date)
    {
        this.caughtMiceCount = caughtMiceCount;
        this.name = name;
        this.yearOfBirth = date;
    }

    @Override
    void sleep() {
        System.out.println("The cat is sleeping.");
    }

    @Override
    void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat" + " " + getName() + " " + "caught " + caughtMiceCount + " mice";
    }
}
