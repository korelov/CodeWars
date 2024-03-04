package kyu_7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class Reverse_words {

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        return Stream.of(original.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("double  spaced  words"));
        System.out.println(reverseWords("a b c d"));
        System.out.println(reverseWords("apple"));
        System.out.println(reverseWords("     "));
    }
}
