package kyu_6;

// https://www.codewars.com/kata/5208f99aee097e6552000148/train/java

public class Break_camelCase {
    public static String camelCase(String input) {
        String res = "";
        String temp = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == temp.charAt(i)) {
                res += input.charAt(i);
            } else {
                res += " " + input.charAt(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {

        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));

    }

}
