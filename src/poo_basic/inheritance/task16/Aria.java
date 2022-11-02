package poo_basic.inheritance.task16;

public class Aria extends Formula {

    private int r;

    public Aria (int r) {
        this.r = r;
    }

    @Override
    public double calculate() {
        return 3.14 * (double) (r * r);
    }
}
