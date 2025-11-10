package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("======Zad1======");
        Zadanie1();

        System.out.println("\n\n\n\n");

        System.out.println("======Zad2======");
        Zadanie2();
    }

    public static void Zadanie1() {
//   input   "some 22 of them 36 are 5 numbers -8";
        // 1.1
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine().trim();

        String[] words = message.split(" ");

        for(String word : words) {
            try {
                int num = Integer.parseInt(word);
                count+=1;

                System.out.println(num);
            } catch (Exception e) {
                // skip
            }
        }

        System.out.println("\n\ntotally " + count + " numbers was found");
        System.out.println("\n\n");

        // 1.2

        System.out.print("Введите бинарный код: ");

        while (true) {
            System.out.print("Введите бинарный код: ");
            String code = scanner.nextLine().trim();

            Scanner binaryScanner = new Scanner(code);
            try {
                int number = binaryScanner.nextInt(2);
                System.out.println("Це бінарне число");

                System.out.println("У десятковій системі це: " + number);
                break;
            } catch (Exception e) {
                System.out.println("not bin!");
            }
        }

        System.out.println("\n\n");

        // 1.3

        System.out.print("Введите hex код: ");

        while (true) {
            System.out.print("Введите hex код: ");
            String hex = scanner.nextLine().trim();

            Scanner hexScanner = new Scanner(hex);
            try {
                int number = hexScanner.nextInt(16);
                System.out.println(hex + " it's a hex code");

                System.out.println("У десятковій системі це: " + number);
                break;
            } catch (Exception e) {
                System.out.println("not hex!");
            }
        }
    }

    public static void Zadanie2() {
        // 2.1
        // 12.674 -3.2801 55.4671 -72.192 7.095

        Scanner numScanner = new Scanner(System.in);

        double[] mas = new  double[5];

        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введіть число #" + (i + 1) + ": ");
            mas[i] = numScanner.nextDouble();
        }

        System.out.println("Введені числа:");
        for (double num : mas) {
            System.out.printf("%+6.2f%n", num);
        }

        System.out.println("\n\n");

        // 2.2

        System.out.println("Binance");
        String[] code = { "AUD", "GBP", "BYR", "DKK", "USD", "EUR", "KZT"};
        int[] unit = { 1, 1, 1000, 10, 1, 1, 100 };
        String[] currency={"Австралійский долар","Фунт стерлінгів", "Билоруский рубль", "Датська крона", "Долар США", "Евро", "Казахське тенге" };
        double[] equivalent = { 23.9883, 45.8429, 19.7716, 25.9192, 27.4643, 31.3695, 15.4654 };

        System.out.printf("%-5s %-13s %-30s %8s\n", "Код", "За одиницю", "Валюта", "UAH");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < code.length; i++) {
            System.out.printf(
                    "%-5s %-13d %-30s %8.4f\n",
                    code[i], unit[i], currency[i], equivalent[i]
            );
        }

        // 2.3

       Scanner scanner = new Scanner(System.in);
       int count = 0;

        System.out.print("\n\n\nВведите сообщение: \n");
       String message = scanner.nextLine();

      while(!message.equalsIgnoreCase("break")) {
          if (message.equals("break")) {
              System.out.println("count of whitespace is " + count);
          } else {
              count += 1;
              System.out.println(message + "\n");

              String nextMessage = scanner.nextLine();
              message = nextMessage;
          }
      }
    }
}
