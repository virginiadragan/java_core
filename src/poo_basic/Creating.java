package poo_basic;

import java.util.Arrays;

public class Creating {
    public void task1 () {
        System.out.println("task1");
        //version 1
        System.out.println("Hello\nVirginia");
        //version 2
        System.out.println("Hello");
        System.out.println("Virginia");
    }

    public void task2 () {
        System.out.println("task2");
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public void task3 (int a, int b) {
        System.out.println("task3");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
    }

    public void task4 () {
        double result;
        double a = 3.5;

        result = ((25.5 * a - a * a) / (40.5 - 4.5));
        System.out.println("task4");
        System.out.println(result);

    }

    public void task5 () {
        double result;
        double a = 1.0;

        result = 4.0 * (a - (a/3) + (a/5) - (a/7) + (a/9) - (a/11));
        System.out.println("task5");
        System.out.println(result);
    }

    public void task6 (int a, int b) {
        System.out.println("task6");
        String EqualOp = (a != b) ? " != " : " == ";
        String BiggerOp = (a < b) ? " < " : " > ";
        String BAndEOp = (a <= b) ? " <= " : " >= ";
        System.out.println(a + EqualOp + b);
        System.out.println(a + BiggerOp + b);
        System.out.println(a + BAndEOp + b);
    }

    public void task7 (String a) {
        System.out.println("task7");
        System.out.println("Decimal Number: " + Integer.parseInt(a,2));
    }

    public void task8 (int a) {
        int numbers[] = new int[5];
        int firstNumber = a - 2;
        for (int i = 0; i < 5; i++) {
            numbers[i] = firstNumber + i;
        }
        System.out.println("task8");
        System.out.println("Ion says " + a);
        System.out.println("Vasile says " + Arrays.toString(numbers));
    }

    public void task9 (int x, int y) {
        double average;
        int difference;

        average = (double)(x + y) / 2;
        difference = Math.abs(x - y);
        System.out.println("task9");
        System.out.println("Average age is " + average + "; Difference is " + difference + " age");
    }

    public void task10 (int years) {
        int months;
        int days;
        int hours;

        months = years * 12;
        days = years * 365;
        hours = days * 24;
        System.out.println("task10");
        System.out.println(months + " months " + days + " days " + hours + " hours");
    }
}
