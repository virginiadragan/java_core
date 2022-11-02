package poo_basic.inheritance.task4;

public class Dog extends Animal {
    private String type;

    public Dog(String food, String location, String breed) {
        this.food = food;
        this.location = location;
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "Dog barks";
    }

    @Override
    public String eat() {
        return "Dog eat " + food;
    }

    @Override
    public String animalType() {
        return "Dog";
    }
}
