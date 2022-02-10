package java_basics;

public class Utils {
    public static void printfromUtils(int msg) {
        System.out.println(msg + 100);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    private static void printSomething(int msg) {
        System.out.println(msg + 100);
    }

    protected static void printSome(int msg) {
        System.out.println(msg + 100);
//        printNew(2);
    }

    public int printNew(int msg) {
        return msg + 100;
    }
}
