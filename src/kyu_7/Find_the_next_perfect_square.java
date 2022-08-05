package kyu_7;

//https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java

public class Find_the_next_perfect_square {

    public static long findNextSquare(long sq) {

        long sqrt = (long) Math.sqrt(sq);
        return sqrt * sqrt == sq ? (sqrt + 1) * (sqrt + 1) : -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(114));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(121));
    }
}
