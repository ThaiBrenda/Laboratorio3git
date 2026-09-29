/**
 * Programa: Serie de Fibonacci (versión iterativa)
 * Autor: Emily Rocio Coaquira Casti
 * Descripción: Genera los primeros n términos de la serie de Fibonacci
 *              utilizando un algoritmo iterativo.
 */
public class fibonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        
        System.out.println("========================================");
        System.out.println(" Serie de Fibonacci - Emily Rocio");
        System.out.println("========================================");
        System.out.println("Primeros " + n + " términos:");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
        System.out.println("========================================");
    }
}
