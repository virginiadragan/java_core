package poo_basic.inheritance.task16;

public class SQR extends Formula {
    private int x;

    public SQR (int x) {
        this.x = x;
    }

    @Override
    public double calculate() {
        return x * x;
    }
}
