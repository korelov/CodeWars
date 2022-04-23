package kyu_8;

// https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java

public class Bin_to_Decimal {
    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("1"));
        System.out.println(binToDecimal("1001001"));
    }
}
