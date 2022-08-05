package kyu_7;

//https://www.codewars.com/kata/55908aad6620c066bc00002a

public class Exes_and_Ohs {
    public static boolean getXO(String str) {

        String temp = str.toLowerCase();
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'x') {
                countX++;
            }
            if (temp.charAt(i) == 'o') {
                countY++;
            }
        }
        return countX == countY;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
