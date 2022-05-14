package kyu_7;

// https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java

public class Pythagorean_Triple {
    static int[] p1 = {3, 4, 5};
    static int[] p2 = {3, 5, 7};

    public static int pythagoreanTriple(int[] triple) {
        int c = (int) Math.pow(triple[2], 2);
        int a = (int) Math.pow(triple[0], 2);
        int b = (int) Math.pow(triple[1], 2);
        if (c == a + b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(pythagoreanTriple(p1));
        System.out.println(pythagoreanTriple(p2));
    }
}
