package kyu_8;

// https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed

public class Replace_all {

    public static String replace(final String s) {
         return s.replaceAll("[aeiouAEIOU]","!");
    }

    public static void main(String[] args) {
        System.out.println(replace("aeiou"));
        System.out.println(replace("Hi!"));
    }
}
