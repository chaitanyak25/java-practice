package java_basics;

public class Variables {
    public static void main(String[] args) {
        int x;
        x=5;
        System.out.println(x);
        x=34;
        System.out.println(x + 10);
        String y1 = "Chaitanya";
        System.out.println(y1);
        boolean status = false;

        System.out.println(y1.length());
        System.out.println(y1.indexOf("t"));
        System.out.println(y1.substring(2,5));

        //String Comparison

        String a = "hello";
        String b = "there";

        if(a.equals("hello")) {
            System.out.println("Comparison worked");
        }

        if(b.equalsIgnoreCase("There")){
            System.out.println("Case Comparison");
        }

        System.out.println(y1.charAt(1));

    }
}
