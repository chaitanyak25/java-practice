package java_basics;

public class LearnMethods {
    public static void main(String[] args) {
        printAnything("World");
        printAnything(50);
        Utils.printfromUtils(90);
        Utils.printSome(1234);
        System.out.println(Utils.addNumbers(10,50));

        Utils myUtils = new Utils();
        System.out.println(myUtils.printNew(12));
    }

    public static void printAnything(String msg) {
        System.out.println("Hello " + msg);
    }

    public static void printAnything(int msg) {
        System.out.println(msg);
    }
}
