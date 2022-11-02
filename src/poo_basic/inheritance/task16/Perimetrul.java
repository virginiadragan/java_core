package poo_basic.inheritance.task16;

public class Perimetrul extends Formula{

    private int a;
    private int b;

    public Perimetrul (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return 2 * a + 2 * b;
    }
}
