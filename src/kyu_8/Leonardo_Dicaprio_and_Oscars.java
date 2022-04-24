package kyu_8;

// https://www.codewars.com/kata/56d49587df52101de70011e4/train/java

public class Leonardo_Dicaprio_and_Oscars {

    public static String leo(final int oscar) {
        String leo = "Leo finally won the oscar! Leo is happy";
        String leo1 = "Not even for Wolf of wallstreet?!";
        String leo2 = "When will you give Leo an Oscar?";
        String leo3 = "Leo got one already!";
        if (oscar > 88) {
            return leo3;
        } else if (oscar == 88) {
            return leo;
        } else if (oscar == 86) {
            return leo1;
        } else {
            return leo2;
        }
    }

    public static void main(String[] args) {
        System.out.println(leo(88));
        System.out.println(leo(86));
        System.out.println(leo(89));
        System.out.println(leo(85));
    }

}
