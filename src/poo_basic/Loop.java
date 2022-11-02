package poo_basic;

public class Loop {

    public void task1 (int n) {
        System.out.println("task1");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + i * i * i);
        }
    }

    public void task2 (int n) {
        String tr = "";
        System.out.println("task2");
        for (int i = 1; i <= n; i++) {
            tr = tr + i;
            System.out.println(tr);
        }
    }

    public void task3 (int n1, int n2) {
        System.out.println("task3");
        for (int i = n1; i <= n2; i++) {
            int last = i % 10;
            if (last > 0 && last % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
    //todo
    public void task4 () {}
    //todo
    public void task5 (int n) {
        int sum = 1;
        System.out.println("\ntask5");
        for (int i = 1; i <= n; i++) {
            sum = sum + sum * i;
        }

        System.out.println(sum);
    }
    //todo
    public void task6 () {}
    //todo
    public void task7 () {}
}
