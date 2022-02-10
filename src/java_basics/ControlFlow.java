package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        int marks = 36;
        String result;

        if(marks<35) {
            result = "Fail";
        } else {
            result = "Pass";
        }

        System.out.println(result);

        int month = 5;
        String monthString = "";

        switch (month) {
            case 1: monthString = "Jan";
                break;
            case 2: monthString = "Feb";
                break;
            case 3: monthString = "Mar";
                break;
            case 4: monthString = "Apr";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "Jun";
                break;
        }

        System.out.println(monthString);

    }
}
