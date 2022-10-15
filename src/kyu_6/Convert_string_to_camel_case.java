package kyu_6;

//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

public class Convert_string_to_camel_case {

    static String toCamelCase(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '_' || s.charAt(i) == '-') {
                res.append(s.toUpperCase().charAt(i + 1));
                i++;
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_stealth_Warrior"));
        System.out.println(toCamelCase("the-Stealth-Warrior"));
    }
}
