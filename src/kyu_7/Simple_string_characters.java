package kyu_7;

// https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/java

import java.util.Arrays;

public class Simple_string_characters {

    public static int[] Solve(String word) {
        int uppercase = 0;
        int lowercase = 0;
        int numbers = 0;
        int characters = 0;

        /** Верное решение
         *   System.out.println(word.replaceAll("[^A-Z]","").length());
         */

        for (int i = 0; i < word.length(); i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                if (word.charAt(i) == j) {
                    uppercase++;
                }
            }
        }
        for (int i = 0; i < word.length(); i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                if (word.charAt(i) == j) {
                    lowercase++;
                }
            }
        }
        for (int i = 0; i < word.length(); i++) {
            for (char j = '0'; j <= '9'; j++) {
                if (word.charAt(i) == j) {
                    numbers++;
                }
            }
        }
        for (int i = 0; i < word.length(); i++) {
            for (char j = '!'; j <= '/'; j++) {
                if (word.charAt(i) == j) {
                    characters++;
                }
            }
            for (char j = ':'; j <= '@'; j++) {
                if (word.charAt(i) == j) {
                    characters++;
                }
            }
            for (char j = '['; j < 'a'; j++) {
                if (word.charAt(i) == j) {
                    characters++;
                }
            }
        }
        return new int[]{uppercase, lowercase, numbers, characters};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solve("*'&ABCDabcde12345")));
        System.out.println(Arrays.toString(Solve("Codewars@codewars123.com")));
        System.out.println(Arrays.toString(Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H")));
        System.out.println(Arrays.toString(Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft")));

    }

}
