package poo_basic.inheritance.task2;

import java.time.Year;

public class Student extends User {
    public int year;

    public Student (String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getCourse() {
        int currentYear = Year.now().getValue();

        return currentYear - year;
    }
}
