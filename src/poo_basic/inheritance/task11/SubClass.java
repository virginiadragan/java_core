package poo_basic.inheritance.task11;

public class SubClass extends SuperClass {
    private int data2;

    public SubClass (int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public int getData2() {
        return data2;
    }

    public void checkCondition() {
        if (data1 == 10 && data2 == 15) {
            System.out.println("Condition True!");
        }
    }
}
