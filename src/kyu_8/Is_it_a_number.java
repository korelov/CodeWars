package kyu_8;

// https://www.codewars.com/kata/57126304cdbf63c6770012bd/train/java

public class Is_it_a_number {
    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        //true
        System.out.println(new Is_it_a_number().isDigit("3"));
        System.out.println(new Is_it_a_number().isDigit("  3  "));
        System.out.println(new Is_it_a_number().isDigit("-3.23"));
        //false
        System.out.println(new Is_it_a_number().isDigit("3-4"));
        System.out.println(new Is_it_a_number().isDigit("3   5  "));
        System.out.println(new Is_it_a_number().isDigit("zero"));
    }

}
