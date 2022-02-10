package java_basics;

public class Arrays {
    public static void main(String[] args) {
        int [] values = new int[100];

        values[0]= 99;

        System.out.println(values[0]);

        String [] strArr = new String[] {"My", "Name", "is"};
//        String [] strArr = new String[12];
        strArr[3] = "Chaitu";
        System.out.println(strArr[3]);
    }
}
