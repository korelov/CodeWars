package kyu_7;

// https://www.codewars.com/kata/566fc12495810954b1000030/train/java

public class Count_the_Digit {

    public static int nbDig(int n, int d) {

        char dig = (char) d;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String temp = Integer.valueOf((int) Math.pow(i, 2)).toString();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j)-48 == dig) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));
        System.out.println(nbDig(5750, 0));
        System.out.println(nbDig(11011, 2));
        System.out.println(nbDig(11549, 1));
    }
}
