package poo_basic;

public class Recursion {

    public int task1 (int n) {
        if (n < 1) {
            return 1;
        }
        return 2 * task1(n - 1);
    }

    public int task2 (int n, int x) {
        if (n % 10 == 0) {
            return 0;
        }
        if (n % 10 == x) {
            return 1 + task2(n / 10, x);
        }

        return task2(n / 10, x);
    }

    public int task4 (String s, String c, String previousC, int maxLngt, int prevMaxLngt) {
        if (s.length() == 0) {
            return Math.max(maxLngt, prevMaxLngt);
        }

        boolean isChar = s.substring(s.length() - 1).equals(c);
        if (isChar && previousC.equals("") || isChar && previousC.equals(c)) {
            return task4(s.substring(0, s.length()-1), c, c, maxLngt + 1, prevMaxLngt);
        }

        if (prevMaxLngt >= maxLngt) {
            return task4(s.substring(0, s.length()-1), c, "", 0, prevMaxLngt);
        } else {
            return task4(s.substring(0, s.length()-1), c, "", 0, maxLngt);
        }
    }
}
