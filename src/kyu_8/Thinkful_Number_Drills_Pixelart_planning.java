package kyu_8;

// https://www.codewars.com/kata/58630e2ae88af44d2b0000ea/train/java

public class Thinkful_Number_Drills_Pixelart_planning {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(4050, 27));
        System.out.println(isDivisible(4066, 27));


    }
}
