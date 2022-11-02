package poo_basic.data_types;

import java.math.BigInteger;
import java.util.Arrays;

public class NumericalDT {
    public void task1 (boolean b, char c, long n) {
        System.out.println("task1");
        System.out.println(((Object) b).getClass().getSimpleName() + " b = " + b);
        System.out.println(((Object) c).getClass().getSimpleName() + " c = " + c);
        System.out.println(((Object) n).getClass().getSimpleName() + " n = " + n);
    }

    // todo
    public void task2 () {
        float x = 1/2;
        System.out.println("task2");
        System.out.println(x);
        System.out.println(-15/4);
        System.out.println(" ");
        System.out.println(-15%4);
    }

    public void task3 (int meters, int h, int m, int s) {
        double totalH = (double) h + (double) m / 60 + (double) s / 3600;
        double totalS = h * 3600 + m * 60 + s;
        double km = (double) meters / 1000;
        double miles = (double) meters / 1609.344;

        System.out.println("task3");
        System.out.println("Your speed in meters/second is " + meters / totalS);
        System.out.println("Your speed in km/h is " + km / totalH);
        System.out.println("Your speed in miles/h is " + miles / totalH);
    }

    public void task4 (int min) {
        int years = min / (60 * 24 * 365);
        int days = (min / 1440) % 365 ;
        System.out.println("task4");
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }

    public void task5 (Integer x) {
        // var 1
        String str = x.toString();
        char ch[] = str.toCharArray();
        System.out.println("task5");
        System.out.println(Arrays.toString(ch));

        //var 2
        int n1 = x / 100000 % 10;
        int n2 = x / 10000 % 10;
        int n3 = x / 1000 % 10;
        int n4 = x / 100 % 10;
        int n5 = x / 10 % 10;
        int n6 = x % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }

    public void task6 (int x) {
        int n1 = x % 1000;
        int n2 = x % 100;
        int n3 = x % 10;
        System.out.println("task6");
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + (n1 + n2 + n3));
    }

    public void task7 (double r, double w, int m) {
        for (int i = 0; i < m; i++) {
            r = r + (r * (w / 100));
        }
        System.out.println("task7");
        System.out.println("Money after " + m + " months: " + r);
    }

    public void task9 (float f, double d) {
        System.out.println("task9");
        System.out.println("Float " + f + " next down is " + Math.nextDown(f));
        System.out.println("Float " + f + " next up is " + Math.nextUp(f));
        System.out.println("Float " + d + " next down is " + Math.nextDown(d));
        System.out.println("Float " + d + " next up is " + Math.nextUp(d));
    }

    public void task10 () {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("task10");
        System.out.println("BigInteger value " + number);
        System.out.println("Convert the said BigInteger to an long value: " + number.longValue());
        System.out.println("Convert the said BigInteger to an int value: " + number.intValue());
        System.out.println("Convert the said BigInteger to an short value: " + number.shortValue());
        System.out.println("Convert the said BigInteger to byte: " + number.byteValue());
        System.out.println("Convert the said BigInteger to exact long: " + number.longValueExact());
    }
}
