package poo_basic.inheritance.task14;

public class Student {

    public String name = "unknown";
    public int age = 0;
    public String address = "not available";

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
