package kyu_8;

// https://www.codewars.com/kata/5641a03210e973055a00000d/train/java

public class Formatting_decimal_places {

    public static double TwoDecimalPlaces(double number) {
        String format = String.format("%.2f",number);
        return Double.parseDouble(format);
    }

    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(4.659725356));
        System.out.println(TwoDecimalPlaces(173735326.3783732637948948));
        System.out.println(TwoDecimalPlaces(34.777774));
    }
}
