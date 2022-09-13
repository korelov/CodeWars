package kyu_7;

// https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

public class Square_Every_Digit {
    public static int squareDigits(int n) {
        String[] temp = ("" + n).split("");
        StringBuilder result = new StringBuilder();
        for (String s : temp) {
            result.append((int) Math.pow(Integer.parseInt(s), 2));
        }
        return Integer.parseInt(result.toString());
    }


    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(0));
    }

}
