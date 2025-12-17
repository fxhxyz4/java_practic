import java.time.LocalDate;
import java.time.Period;

abstract class PetAnimal implements Comparable<PetAnimal> {
    public String name;
    public LocalDate yearOfBirth;

    public PetAnimal() {}

    public PetAnimal(String name) {
        this(name, LocalDate.now());
    }

    public PetAnimal(LocalDate yearOfBirth) {
        this("undefined", LocalDate.parse(yearOfBirth.toString()));
    }

    public PetAnimal(String name, LocalDate yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        if (yearOfBirth == null) return 0;
        return Period.between(yearOfBirth, LocalDate.now()).getYears();
    }

    public String typeAge() {
        return getName() + " " +  getAge() + " year";
    }

    public String getName() {
        if (name == null) return "";
        return name;
    }

   abstract void sleep();
    abstract void makeSound();

    @Override
    public int compareTo(PetAnimal o) {
        return this.getName().compareTo(o.getName());
    }
}
