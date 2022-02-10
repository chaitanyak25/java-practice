package java_oop;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("Flying");
    }
}
