package poo_basic.inheritance.task6;

public class MovableCircle implements Movable {
    @Override
    public void moveUp() {
        System.out.println("Circle move up");
    }

    @Override
    public void moveDown() {
        System.out.println("Circle move down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Circle move left");
    }

    @Override
    public void moveRight() {
        System.out.println("Circle move right");
    }
}
