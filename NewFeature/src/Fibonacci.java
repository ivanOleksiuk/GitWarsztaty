public class Fibonacci {

    public Fibonacci() {

    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
