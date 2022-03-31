package models;

import java.util.List;

public class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int l = lcm(a);
        int f = gcd(b);
        int count = 0;
        for (int i = l, j = 2; i <= f; i = l * j, j++) {
            if (f % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(List<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            result = gcd(result, input.get(i));
        }
        return result;
    }

    public static int lcm(List<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            result = lcm(result, input.get(i));
        }
        return result;
    }
}
