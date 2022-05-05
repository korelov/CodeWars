package kyu_6;

// https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

public class Sum_of_Digits {

    public static int digital_root(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 10) {
            sum = Sum_of_Digits.digital_root(sum);
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(digital_root(99));
        System.out.println(digital_root(16));
        System.out.println(digital_root(456));
        System.out.println(digital_root(Integer.MAX_VALUE));
    }
}
