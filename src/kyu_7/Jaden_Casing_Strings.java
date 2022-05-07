package kyu_7;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

import java.util.Arrays;

public class Jaden_Casing_Strings {
    public static String toJadenCase(String phrase) {
        if(phrase==null || phrase.length()==0){
            return null;
        }
        String res = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                res += phrase.toUpperCase().charAt(i);
            } else if (phrase.charAt(i) == ' ') {
                res += " " + phrase.toUpperCase().charAt(i + 1);
                i++;
            } else {
                res += phrase.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase(""));
    }
}
