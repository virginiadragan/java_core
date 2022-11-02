package poo_basic;

public class Conditional {
    public void task1 (int n) {
        System.out.println("Task1");
        if (n < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("positive number");
        }
    }

    public void task2 (int n1, int n2, int n3) {
        int max = getMax(n1, n2, n3);

        System.out.println("Task2");
        System.out.println(max);
    }

    public void task3 (int n) {
        System.out.println("Task3");

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n > 2 && n < 5) {
                System.out.println("Not Weird");
            } else if (n > 6 && n < 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }

    public void task4 (int n1, int n2, int n3) {
        int max = getMax(n1, n2, n3);
        int min = getMin(n1, n2, n3);

        System.out.println("Task4");
        System.out.println(max - min);
    }

    public void task5 (int n) {
        int finalNumber;
        int n1 = n / 100 % 10;
        int n2 = n / 10 % 10;
        int n3 = n % 10;
        int max = getMax(n1, n2, n3);
        int min = getMin(n1, n2, n3);
        int med = n1;

        if (n2 > min && n2 < max) {
            med = n2;
        } else if (n3 > min && n3 < max) {
            med = n3;
        }

        finalNumber = max * 100 + med * 10 + min;
        System.out.println("Task5");
        System.out.println(finalNumber);
    }

    public void task6 (int n) {
        int n1 = n / 100 % 10;
        int n2 = n / 10 % 10;
        int n3 = n % 10;
        int sum = n1 + n2 + n3;
        int product = n1 * n2 * n3;

        System.out.println("Task6");

        if (sum / 100 == 0 && sum / 10 != 0) {
            System.out.println("sum of the digits of the number X represents a number of exactly 2 digits");
        }
        if (product / 1000 == 0 && product / 100 != 0 && sum / 10 != 0) {
            System.out.println("product of the digits of the number X represents a number of exactly 3 digits");
        }
        if (product > n) {
            System.out.println("product of the digits of the number X is greater than the number X itself");
        }
        if (sum % 5 == 0) {
            System.out.println("sum of the digits of the number X is divisible by the number Y");
        }
    }
    //todo
    public void task7 () {

    }
    //todo
    public void task8 () {

    }

    public void task9 (int n) {
        System.out.println("Task9");
        switch (n) {
            case 1:
                System.out.println("I");
                break;
            case 5:
                System.out.println("V");
                break;
            case 10:
                System.out.println("X");
                break;
            case 50:
                System.out.println("L");
                break;
            case 100:
                System.out.println("C");
                break;
            case 500:
                System.out.println("D");
                break;
            case 1000:
                System.out.println("M");
                break;
        }
    }

    public void task10 (int n) {
        System.out.println("Task10");
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    //todo
    public void task11 () {

    }


    public int getMax (int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max) {
            max = n2;
        } else if (n3 > max) {
            max = n3;
        }

        return max;
    }

    public int getMin (int n1, int n2, int n3) {
        int min = n1;
        if (n2 < min) {
            min = n2;
        } else if (n3 < min) {
            min = n3;
        }

        return min;
    }
}
