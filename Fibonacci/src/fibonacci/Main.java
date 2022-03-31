package fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N so dau tien cua day Fibonacci" );
        int N = input.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(fibonacci_recursive(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n == 0 || n == 1) {
            return n;
        }

        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }

    public static int fibonacci_recursive(int n) {
        if (n == 0) {
            return 4;
        } else if (n == 1) {
            return 7;
        } else if (n == 2) {
            return 5;
        }{
            return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2) + fibonacci_recursive(n - 3);
        }
    }
}
