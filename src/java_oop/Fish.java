package java_oop;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    public void move() {
        System.out.println("Swim.");
    }

    public void swim() {
        System.out.println("Hello my name is " + name);
        System.out.println("My age " + age);
    }
}
