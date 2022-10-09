package kyu_6;

import java.util.LinkedHashSet;
import java.util.Set;

//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

public class Counting_Duplicates {

    public static int duplicateCount(String text) {

        String textLower = text.toLowerCase();
        Set<Character> uniqueRepeats = new LinkedHashSet<>();
        for (int i = 0; i < textLower.length() - 1; i++) {
            char character = textLower.charAt(i);

            if (!uniqueRepeats.contains(character) && textLower.indexOf(character, i + 1) != -1) {
                uniqueRepeats.add(character);
            }
        }
        return uniqueRepeats.size();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("indivisibility"));
    }

}
