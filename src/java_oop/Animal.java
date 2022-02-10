package java_oop;

public abstract class Animal {

    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("My age " + age);
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public abstract void move();
}
