package kyu_7;

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

public class Mumbling {

    public static String accum(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    temp = "" + s.toUpperCase().charAt(i);
                } else {
                    temp += s.toLowerCase().charAt(i);
                }
            }
            if (i < s.length()-1) {
                res += temp + "-";
            } else{
                res += temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
        System.out.println(accum("HbideVbxncC"));
    }
}
