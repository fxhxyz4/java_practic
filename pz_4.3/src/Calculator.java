public class Calculator {
    public static int factorial (int n) {
        if (n == 0) return 0;

        return n * factorial(n - 1);
    }
}