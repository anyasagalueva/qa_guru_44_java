package com.anyasagalueva;

public class Homework {
    public static void main(String[] args) {
        // 0) арифметика над двумя int
        int a = 20;
        int b = 6;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 1) арифметика над int и double в одном выражении
        int x = 5;
        double y = 2.5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x - y * 2 = " + (x - y * 2));

        // 2) логические операции сравнения
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= 20 : " + (a >= 20));
        System.out.println("b <= 5 : " + (b <= 5));
        System.out.println("x > y : " + (x > y));
        System.out.println("a > b && x > y : " + (a > b && x > y));
        System.out.println("a < b || x > y : " + (a < b || x > y));

        // 3) диапазоны чисел с плавающей точкой
        System.out.println("float max = " + Float.MAX_VALUE);
        System.out.println("float min = " + Float.MIN_VALUE);
        System.out.println("double max = " + Double.MAX_VALUE);
        System.out.println("double min = " + Double.MIN_VALUE);

        // 4) переполнение
        int maxInt = 2147483647;
        System.out.println("maxInt + 1 = " + (maxInt + 1));

        byte maxByte = 127;
        maxByte++;
        System.out.println("byte 127 после ++ = " + maxByte);
    }
}
