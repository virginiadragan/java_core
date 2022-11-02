package poo_basic.inheritance.task6;

public class MovablePoint implements Movable {
    @Override
    public void moveUp() {
        System.out.println("Point move up");
    }

    @Override
    public void moveDown() {
        System.out.println("Point move down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Point move left");
    }

    @Override
    public void moveRight() {
        System.out.println("Point move right");
    }
}
