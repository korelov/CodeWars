package kyu_8;

// https://www.codewars.com/kata/59811fd8a070625d4c000013


public class Find_the_Integral {

    public static String integrate(int coefficient, int exponent) {

        return (coefficient / (exponent + 1)) + "x^" + (exponent + 1);
    }

    public static void main(String[] args) {

        System.out.println(integrate(3, 2));
        System.out.println(integrate(12,5));
        System.out.println(integrate(20,1));
        System.out.println(integrate(90,2));
    }

}
