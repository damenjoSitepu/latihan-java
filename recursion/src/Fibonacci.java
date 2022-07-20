public class Fibonacci {
    public static void main(String args[]) throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacci(6);
        System.out.print(result);
    }

    // Fibonacci Function
    public int fibonacci(int n) {
        if (n < 0)
            return 0;

        if (n == 0 || n == 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
