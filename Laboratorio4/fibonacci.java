/**
 * Programa: Serie de Fibonacci
 */
public class fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("========================================");
        System.out.println(" Serie de Fibonacci");
        System.out.println("========================================");
        System.out.println("Primeros " + n + " términos:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
        System.out.println("========================================");
    }
}