package poo_basic.inheritance.task4;

public class Cat extends Animal {
    private String type;

    public Cat(String food, String location, String breed) {
        this.food = food;
        this.location = location;
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "Cat meows";
    }

    @Override
    public String eat() {
        return "Cat eat " + food;
    }
}
