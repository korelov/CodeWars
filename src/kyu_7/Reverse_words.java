package kyu_7;

//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class Reverse_words {

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        StringBuilder res = new StringBuilder();
        String[] s = original.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 1) {
                res.append(new StringBuilder(s[i]).reverse()).append(" ");
            } else {
                res.append(new StringBuilder(s[i]).reverse());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("double  spaced  words"));
        System.out.println(reverseWords("a b c d"));
        System.out.println(reverseWords("apple"));
        System.out.println(reverseWords("     "));
    }
}
