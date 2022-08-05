package kyu_7;

//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.Arrays;

public class Anagram_Detection {

    public static boolean isAnagram(String test, String original) {

        if(original.length()!=test.length()){
            return false;
        }
        char[] temp = original.toLowerCase().toCharArray();
        char[] temp1 = test.toLowerCase().toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp1);
        return new String(temp).equals(new String(temp1));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));
        System.out.println(isAnagram("Twoo", "Woot"));
        System.out.println(isAnagram("apple", "pale"));
    }
}
