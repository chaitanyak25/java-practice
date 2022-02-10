package java_basics.loops;

public class LoopsPractice {
    public static void main(String[] args) {
        int count = 0;

        while(count <= 100) {
            System.out.println("Chai " + count);
            count++;
            if(count == 30) {
                break;
            }
        }

        String a = "Hello , category:Shoe" +
                " new category:Shirt" +
                " fast category:Cap ";
        printCategories(a);
    }

    public static void printCategories(String str) {
        int i = 0;
        while (true) {
            int found = str.indexOf("category:", i);
            if(found == -1) break;
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start,end));
            i = end + 1;
        }

    }
}
