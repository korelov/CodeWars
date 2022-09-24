package kyu_6;

//https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

public class Bit_Counting {
    public static int countBits(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            res.append(n % 2);
            n = n / 2;
        }
       return res.toString().replaceAll("[^1]","").length();
    }

    public static void main(String[] args) {
        System.out.println(countBits(4));
        System.out.println(countBits(1234));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
    }
}
