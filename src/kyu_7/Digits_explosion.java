package kyu_7;

// https://www.codewars.com/kata/585b1fafe08bae9988000314/train/java

public class Digits_explosion {


    public static String explode(String digits) {
        String[] arr = digits.split("");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < Integer.parseInt(arr[i]); j++) {
                res += arr[i] + "";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(explode("123"));
        System.out.println(explode("312"));
    }
}
