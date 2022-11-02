package poo_basic;

import poo_basic.inheritance.BankAccount;
import poo_basic.inheritance.Task13;
import poo_basic.inheritance.task10.Circle;
import poo_basic.inheritance.task10.Rectangle;
import poo_basic.inheritance.task11.SubClass;
import poo_basic.inheritance.task14.Student;
import poo_basic.inheritance.task16.Aria;
import poo_basic.inheritance.task16.Formula;
import poo_basic.inheritance.task16.Perimetrul;
import poo_basic.inheritance.task16.SQR;
import poo_basic.inheritance.task4.*;
import poo_basic.inheritance.task9.Cow;
import poo_basic.inheritance.task9.Whale;
import poo_basic.linkedLists.Task1;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
//        Creating creating = new Creating();
//        creating.task1();
//        creating.task2();
//        creating.task3(143, 22);
//        creating.task4();
//        creating.task5();
//        creating.task6(25, 39);
//        creating.task7("100");
//        creating.task8(10);
//        creating.task9(18, 21);
//        creating.task10(2);
//
//        NumericalDT numerical = new NumericalDT();
//        numerical.task1(true, 'w', 2147483647);
//        numerical.task2();
//        numerical.task3(2500, 5, 56, 23);
//        numerical.task4(3456789);
//        numerical.task5(150832);
//        numerical.task6(2486);
//        numerical.task7(500, 50.0, 3);
//        numerical.task9(0.3f, 0.3);
//        numerical.task10();
//
//        StringDT string = new StringDT();
//        string.task1("Hello World");
//        string.task2("It's hard to find a favorite job", 20, 32);
//        string.task3("I'm an intern at PowerIt!", "I'm an intern at powerit");
//        string.task4("I'm a student, ", "I like to study!");
//        string.task5("adsfdgf", "fewgtrgrtb");
//        string.task6("Hello World!!!");
//        string.task7("Java is a popular programming language.", "pro");
//        string.task8("Java programming tutorial is designed for students and working professionals");
//        string.task9("good", "photo", "ghost");
//        string.task10("Java 30 is a popular10 programming 15 language");
//        string.task11("aaabbc");
//        string.task12("my name is");
//
//        DateTimeDT dt = new DateTimeDT();
//        dt.task1();
//
//        Conditional conditional = new Conditional();
//        conditional.task1(-38);
//        conditional.task2(10, -52, 65);
//        conditional.task3(10);
//        conditional.task4(100, 15, 105);
//        conditional.task5(186);
//        conditional.task6(186);
//        conditional.task9(100);
//        conditional.task10(4);
//
//        Loop loop = new Loop();
//        loop.task1(5);
//        loop.task2(6);
//        loop.task3(10, 99);
//        loop.task5(3);
//
//        Collections collections = new Collections();
//        collections.task1();
//        int arr[] = new int[]{25, 8, 12, 0, -4, 3, 20};
//        collections.task2(arr, 4);
//        collections.task3(12);
//        collections.task4(3, 17);
//        collections.task5();
//        collections.task6();
//
//        FilesIO filesIO = new FilesIO();
//        filesIO.task1();

//        System.out.println(Methods.task1(38, 25.7, 56.84));
//        System.out.println(Methods.task2("I'm an intern at PowerIt!"));
//        Methods.task3();
//        System.out.println(Methods.task4(27914));
//        System.out.println(Methods.task5("PowerIt"));
//        Methods.task6();
//        System.out.println(Methods.task7(1600));

//        Person person = new Person();
//        person.printPersonInfo();
//        person.setHomeAddress("Deceba 21, ap 2");
//        person.getHomeAddress();
//        person.setIdentityNumber("2322155445332");
//        person.getIdentityNumber();
//        person.setPhone("069324554");
//        person.getPhone();

//        Worker worker = new Worker();
//        worker.setSalary(4000);
//        System.out.println("brutto salary: " + worker.getSalary());
//        System.out.println("netto salary: " + worker.getNettoSalary());
//        System.out.println("increase salary: " + worker.increase(2000));
//        System.out.println("decrease salary: " + worker.decrease(2000));
//        Worker worker1 = new Worker();
//        Worker worker2 = new Worker();
//        worker1.companyName = "Company 1";
//        worker2.companyName = "Company 2";
//        System.out.println(worker1.companyName);
//        System.out.println(worker2.companyName);
//
//        Worker.changeCompanyName("Company 3");
//        System.out.println(worker1.companyName);
//        System.out.println(worker2.companyName);
//
//        worker.toString();
//        worker.hashCode();

//        BankAccount A1 = new BankAccount();
//        BankAccount B2 = new BankAccount();
//        BankAccount C3 = new BankAccount();
//
//        A1.setAccountNumber("A1");
//        A1.setAccountBalance(105);
//        B2.setAccountNumber("B2");
//        B2.setAccountBalance(95);
//        C3.setAccountNumber("C3");
//        C3.setAccountBalance(35);
//
//        System.out.println(A1.getAccountNumber() + ": " + A1.getAccountBalance());
//        System.out.println(B2.getAccountNumber() + ": " + B2.getAccountBalance());
//        System.out.println(C3.getAccountNumber() + ": " + C3.getAccountBalance());
//
//        transfer(A1, B2);
//        transfer(C3, B2);
//        transfer(A1, C3);
//        transfer(A1, B2);
//
//        System.out.println(A1.getAccountNumber() + ": " + A1.getAccountBalance());
//        System.out.println(B2.getAccountNumber() + ": " + B2.getAccountBalance());
//        System.out.println(C3.getAccountNumber() + ": " + C3.getAccountBalance());

//        Student student = new Student("John", "Doe", 2018);
//        System.out.println(student.name);
//        System.out.println(student.surname);
//        System.out.println(student.getFullName());
//        System.out.println(student.year);
//        System.out.println(student.getCourse());

//        Animal animal = new Animal();
//        Cat cat = new Cat("milk", "house", "cat breed");
//        Dog dog = new Dog("bones", "kennel", "dog breed");
//        Horse horse = new Horse("hay", "stable", "horse breed");
//        Cow cow = new Cow();
//        Whale whale = new Whale();
//
//        Animal[] animals = {cat, dog, horse};
//        for (Animal i : animals) {
//            Veterinary.treatAnimal(i);
//        }
//
//        System.out.println(cow.animalType());
//        System.out.println(whale.animalType());
//        System.out.println(dog.animalType());
//        System.out.println(animal.animalType());

//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        circle.show();
//        circle.getInfo();
//        rectangle.show();
//        rectangle.getInfo();

//        Task13 task13 = new Task13();
//        task13.print(12, 'f');
//        task13.print('g', 34);

//        Student s1 = new Student();
//        s1.setInfo("Ion", 21);
//        Student s2 = new Student();
//        s2.setInfo("Mihai", 22, "Decebal");
//        Student s3 = new Student();
//        s3.setInfo("Alexei", 22, "Decebal");
//        Student s4 = new Student();
//        s4.setInfo("Ana", 20);
//        Student s5 = new Student();
//        s5.setInfo("Maria", 23, "Alexandru cel Bun");
//
//        Student students[] = {s1, s2, s3, s4, s5};
//
//        for (Student student: students) {
//            System.out.println("name: " + student.name);
//            System.out.println("age: " + student.age);
//            System.out.println("address: " + student.address);
//        }

//        SQR sqr1 = new SQR(3);
//        SQR sqr2 = new SQR(4);
//        SQR sqr3 = new SQR(2);
//        Aria aria1 = new Aria(2);
//        Aria aria2 = new Aria(7);
//        Aria aria3 = new Aria(5);
//        Perimetrul perimetrul1 = new Perimetrul(3, 2);
//        Perimetrul perimetrul2 = new Perimetrul(4,6);
//        Perimetrul perimetrul3 = new Perimetrul(12, 7);
//        Perimetrul perimetrul4 = new Perimetrul(5, 10);
//
//        Formula arr[] = {sqr1, sqr2, sqr3, aria1, aria2, aria3, perimetrul1, perimetrul2, perimetrul3, perimetrul4};
//
//        for (Formula formula : arr) {
//            System.out.println(formula.calculate());
//        }
//        Recursion recursion = new Recursion();
//        System.out.println(recursion.task1(5));
//        System.out.println(recursion.task2(2353433, 3));
//        System.out.println(recursion.task4("aaaaabcd acdaaaaaaab aaacard", "a", "", 0, 0));

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(2, 3, 4, 5, 8));
        Task1 task1 = new Task1();
//        System.out.println(task1.isOrderedIt(linkedList));
//        System.out.println(task1.isOrderedRec(linkedList, linkedList.size()));
//        task1.searchElmIt(linkedList, 7);
//        task1.searchElmRec(linkedList, 7, 1);
//        System.out.println(task1.addElmIt(linkedList, 2));
//        System.out.println(task1.addElmRec(linkedList, 7, 1));
//        System.out.println(task1.removeElmIt(linkedList, 3));
//        System.out.println(task1.removeElmRec(linkedList, 3, 0));
    }
    public static void transfer(BankAccount obj1, BankAccount obj2) {
        if ((obj1.getAccountBalance() - 50) > 0) {
            obj1.setAccountBalance(obj1.getAccountBalance() - 50);
            obj2.setAccountBalance(obj2.getAccountBalance() + 50);
        } else {
            System.out.println("not enough money");
        }
    }
}
