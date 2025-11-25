import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        System.out.println("-------------- 1 ZAVD --------------");
        TaxiPark park = new TaxiPark(10);

        park.addCar(new PassengerCar("Toyota Corolla", 180, 6.5, 15000, 5));
        park.addCar(new Truck("Volkswagen Passat", 120, 20, 60000, 5000));
        park.addCar(new SportCar("Porsche 911", 320, 12, 90000));

        System.out.println("Загальна вартість: " + park.totalPrice());
        System.out.println("Сумарна вантажність: " + park.totalCargo());
        System.out.println("Сумарна пасажиромісткість: " + park.totalPassengers());

        System.out.println("\n\nАвто зі швидкістю 180 км/год:");
        park.findByMaxSpeed(180);

        System.out.println("-------------- 2 ZAVD --------------");

        MyArrayList list = new MyArrayList();

        list.add(new Box("A"));
        list.add(new Box("B"));
        list.add(new Box("C"));

        printArr(list);

        System.out.println("\n=== TEST 2: add(index) ===");
        list.add(1, new Box("X"));
        printArr(list);

        Box[] arr1 = { new Box("D"), new Box("E"), new Box("F") };
        list.addAll(arr1);
        printArr(list);

        System.out.println("\n=== TEST 4: addAll(index) ===");
        Box[] arr2 = { new Box("Y"), new Box("Z") };

        list.addAll(2, arr2);
        printArr(list);

        System.out.println("\n=== TEST 5: ensureCapacity ===");
        list.ensureCapacity(50);
        System.out.println("ensureCapacity(50) выполнено.");
        printArr(list);

        System.out.println("\n=== TEST 6: get() ===");
        System.out.println("list.get(3) = " + list.get(2));

        System.out.println("\n=== TEST 7: set() ===");
        list.set(3, new Box("REPLACED"));
        printArr(list);

        System.out.println("\n=== TEST 8: remove() и уменьшение capacity ===");
        System.out.println("Удалили: " + list.remove(2));
        printArr(list);

        System.out.println("\n=== TEST 9: size() ===");
        System.out.println("Размер списка = " + list.size());
    }

    private static void printArr(MyArrayList list) {
        System.out.print("List (" + list.size() + "): ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
}
