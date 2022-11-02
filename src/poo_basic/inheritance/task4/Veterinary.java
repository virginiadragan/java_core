package poo_basic.inheritance.task4;

public class Veterinary {

    public static void treatAnimal(Animal animal) {
        System.out.println("food: " + animal.food);
        System.out.println("location: " + animal.location);

        animal.breed = "unknown";
    }
}
