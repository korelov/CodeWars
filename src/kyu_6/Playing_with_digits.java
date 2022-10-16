package kyu_6;

//https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java

public class Playing_with_digits {

    public static long digPow(int n, int p) {

        String number = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Math.pow(Integer.parseInt(number.charAt(i) + ""), p);
            p++;
        }
        if ((sum % n) == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(695, 2));
        System.out.println(digPow(46288, 3));
    }

}
