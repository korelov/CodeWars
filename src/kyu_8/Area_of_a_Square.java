package kyu_8;

// https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java

public class Area_of_a_Square {

    public static double squareArea(double A) {
        double r = ((2 * A) / Math.PI);
        double b = (r * r);
        return Double.parseDouble(String.format("%.2f", b));
    }

    public static void main(String[] args) {
        System.out.println(squareArea(2));
        System.out.println(squareArea(0));
        System.out.println(squareArea(14.05));
    }
}
