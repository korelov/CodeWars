package kyu_6;

//https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java

import java.util.Arrays;

public class Split_Strings {
    public static String[] solution(String s) {

        String[] strings = new String[s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1];
        for (int i = 0, indexArray = 0; i < s.length(); i++) {
            if (s.length() % 2 != 0 && indexArray == strings.length - 1) {
                strings[indexArray] = s.charAt(i) + "_";
                break;
            }
            strings[indexArray++] = s.charAt(i) + "" + s.charAt(i + 1);
            i = i + 1;
        }
        return strings;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("HelloWorld")));

        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("LovePizza")));
    }

}
