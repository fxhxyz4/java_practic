import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Cat cat1 = new Cat("мурка", LocalDate.of(2018, 5, 12));
      Cat cat2 = new Cat("барсик", LocalDate.of(2012, 5, 12));
      Cat cat3 = new Cat("барсик", LocalDate.of(2012, 5, 12));

      List<Cat> cats = new ArrayList<Cat>(List.of(cat1, cat2, cat3));
      cats.sort(new AnimalByAgeComparator(Order.ASCENDING));

      printSection("Коты (от самого молодого к старшему)", cats);

      Dog dog1 = new Dog("Бобик", LocalDate.of(2015, 4, 10));
      Dog dog2 = new Dog("Шарик", LocalDate.of(2018, 7, 5));
      Dog dog3 = new Dog("Тузик", LocalDate.of(2016, 1, 20));

      List<Dog> dogs = new ArrayList<Dog>(List.of(dog1, dog2, dog3));
      dogs.sort(new AnimalByAgeComparator(Order.ASCENDING));

      printSection("Собаки (от самой молодой к старшей)", dogs);

      List<PetAnimal> rancho = new ArrayList<>();
      rancho.addAll(cats);
      rancho.addAll(dogs);

      rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));

      printRancho("Ранчо (все животные, от старшего к младшему)", rancho);
   }

   private static void printSection(String title, List<? extends PetAnimal> animals) {
      String sep = repeat("=", 60);
      System.out.println();

      System.out.println(sep);
      System.out.printf(" %s%n", title);

      System.out.println(sep);
      System.out.printf("\tВсего: %d%n", animals.size());

      System.out.println();

      for (int i = 0; i < animals.size(); i++) {
         PetAnimal a = animals.get(i);
         System.out.printf("\t%2d) [%s]\t%s%n", i + 1, a.getClass().getSimpleName(), a);
      }

      System.out.println(sep);
   }

   private static void printRancho(String title, List<PetAnimal> animals) {
      String sep = repeat("-", 60);
      System.out.println();

      System.out.println(sep);
      System.out.printf(" %s%n", title);

      System.out.println(sep);
      System.out.printf("\tВсего животных в ранчо: %d%n", animals.size());

      System.out.println();

      for (int i = 0; i < animals.size(); i++) {
         PetAnimal a = animals.get(i);
         System.out.printf("\t%2d) [%s]\t%s%n", i + 1, a.getClass().getSimpleName(), a.typeAge());
      }

      System.out.println(sep);
   }

   private static String repeat(String s, int times) {
      StringBuilder sb = new StringBuilder(times * s.length());

      for (int i = 0; i < times; i++) {
         sb.append(s);
      }

      return sb.toString();
   }
}