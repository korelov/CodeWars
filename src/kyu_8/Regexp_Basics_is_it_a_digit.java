package kyu_8;

// https://www.codewars.com/kata/567bf4f7ee34510f69000032/train/java

public class Regexp_Basics_is_it_a_digit {

    public static boolean isDigit(String s) {
        try {
            int a = Integer.parseInt(s);
            if (a > 0 && a < 10) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDigit("5"));
        System.out.println(isDigit(""));
        System.out.println(isDigit("a5"));
        System.out.println(isDigit("14"));
    }
}
