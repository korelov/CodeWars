package kyu_8;

//https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java

public class Binary_Addition {

    public static String binaryAddition(int a, int b) {
        int number = a + b;
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            stringBuilder.append(number % 2);
            number = number / 2;
        }
        return stringBuilder.reverse().toString();
        //return Integer.toBinaryString(a + b);
    }

    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
    }


}
