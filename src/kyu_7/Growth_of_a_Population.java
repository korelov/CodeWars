package kyu_7;

//https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

public class Growth_of_a_Population {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        int pop = p0;
        while (pop < p) {
            pop += pop * percent / 100 + aug;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }
}
