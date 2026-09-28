public class fibonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        
        System.out.println("Serie de Fibonacci (primeros " + n + " términos):");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
}
