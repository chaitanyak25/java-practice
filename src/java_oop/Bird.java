package java_oop;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("Wings");
    }

}
