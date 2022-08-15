package kyu_7;

//https://www.codewars.com/kata/5b93fecd8463745630001d05/train/java

public class Snail_crawls_up {

    public static int snail(int column, int day, int night) {

        if (day >= column) return 1;

        return ((column - night - 1) / (day - night) + 1);
    }


    public static void main(String[] args) {
        System.out.println(snail(10, 4, 3));
    }
}
