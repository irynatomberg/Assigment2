package org.example;

public class Triangle {

    public static String classify(int a, int b, int c) {

        if (a < 1 || a > 200) return "Value of a is not in range";
        if (b < 1 || b > 200) return "Value of b is not in range";
        if (c < 1 || c > 200) return "Value of c is not in range";

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }

        if (a == b && b == c) return "Equilateral";

        if (a == b || b == c || a == c) return "Isosceles";

        return "Scalene";
    }
}
