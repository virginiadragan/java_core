package poo_basic.modifiers;

public class Worker {
    private String name;
    private int salary;
    public static String companyName;

    {
        salary = 1000;
        name = "Mike";
    }
    {
        System.out.println("Worker name: " + name);
        System.out.println("Worker salary: " + salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public double getNettoSalary () {
        return salary - (salary * 0.2);
    }

    public int increase (int num) {
        return salary + num;
    }

    public int decrease (int num) {
        return salary - num;
    }

    public static void changeCompanyName (String newName) {
        companyName = newName;
    }

    @Override
    public String toString () {
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("company name: " + companyName);
        return "end";
    }

    @Override
    public int hashCode () {
        System.out.println("Class hash code is: " + name.hashCode());
        return 1;
    }

}
