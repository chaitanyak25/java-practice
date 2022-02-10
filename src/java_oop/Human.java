package java_oop;

public class Human {

    String name;
    int age;

    public Human(String name, int age, int heightInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyeColor = eyeColor;
    }

    int heightInches;
    String eyeColor;


    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("My age " + age);
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void walk() {
        System.out.println("Walking...");
    }
}
