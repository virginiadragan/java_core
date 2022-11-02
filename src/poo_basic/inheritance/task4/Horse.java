package poo_basic.inheritance.task4;

public class Horse extends Animal {
    private String type;

    public Horse(String food, String location, String breed) {
        this.food = food;
        this.location = location;
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "Horse neighs";
    }

    @Override
    public String eat() {
        return "Horse eat " + food;
    }
}
