package kyu_7;

//https://www.codewars.com/kata/58fa273ca6d84c158e000052

public class Number_of_Decimal_Digits {

    public static int Digits(long n) {
        String s = n + "";
        return s.replaceAll("[\\d]]","").length();
    }

    public static void main(String[] args) {
        System.out.println(Digits(12345l));
        System.out.println(Digits(9876543210l));
    }
}
