package poo_basic.modifiers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Methods {
    public static double task1 (int a, double b, double c) {
        double avg;
        avg = (a + b + c) / 3;
        return avg;
    }

    public static int task2 (String s) {
        int result = 0;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'));

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    public static void task3 () {
        int arr[][] = new int[5][10];
        arr[0][0] = 1;
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                n++;
                arr[i][j] = n * (3 * n - 1) / 2;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int task4 (int k) {
        int digitsNumber;
        k = k / 10;
        digitsNumber = String.valueOf(k).length();
        k = k % (int)Math.pow(10, digitsNumber - 1);

        return k;
    }

    public static boolean task5 (String pass) {
        String rez;
        int passLength = pass.length();
        int digitsNr = 0;

        for (int i = 0; i < passLength; i++) {
            char c = pass.charAt(i);
            if (c <= '9' && c >= '0') {
                digitsNr++;
                continue;
            }
            if (!(Character.toUpperCase(c) <= 'Z' && Character.toUpperCase(c) >= 'A')) {
                return false;
            }
        }

        return (passLength >= 10 && digitsNr >=2);
    }

    public static void task6 () {
        Date date = new Date();
        String dateForm = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM).format(date);

        System.out.println("Current date and time: " + dateForm);
    }

    public static boolean task7 (int y) {
        if (y % 100 == 0 && y % 400 == 0) {
            return true;
        } else if (y % 100 != 0 && y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
