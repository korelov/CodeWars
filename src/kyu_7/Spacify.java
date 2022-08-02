package kyu_7;

//https://www.codewars.com/kata/57f8ee485cae443c4d000127

public class Spacify {
    public static String spacify(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                res += str.charAt(i) + " ";
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(spacify("hello world"));
    }
}
