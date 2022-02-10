package java_oop;

public class Earth {
    public static void main(String[] args) {
//        Human chai = new Human();
//        chai.name = "Chaitu";
//        chai.age = 32;
//
//        chai.speak();
//
//        Human joe = new Human();
//        joe.name = "Hello";
//
//        joe.speak();
        Human chai = new Human("Chaitu",25,6,"Black");
        Human chai2 = new Human("Chaitanya",25,6,"Black");
        chai.speak();
        chai = new Human("qwert",25,6,"Black");
        chai.speak();
        chai2.speak();

        Fish f = new Fish("Phirana",3);
        f.swim();

        Sparrow s = new Sparrow("qwert",34);
        s.fly();
    }
}
