package kyu_6;

//https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java

public class Does_my_number_look_big_in_this {

    public static boolean isNarcissistic(int number) {
        int numberLength = String.valueOf(number).length();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, numberLength);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
        System.out.println(isNarcissistic(112));
    }
}
