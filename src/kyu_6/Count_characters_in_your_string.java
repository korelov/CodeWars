package kyu_6;

// https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java

import java.util.HashMap;
import java.util.Map;

public class Count_characters_in_your_string {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            map.put(charAt, map.getOrDefault(charAt, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map = count("aabbbac");
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
