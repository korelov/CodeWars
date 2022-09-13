package kyu_8;

//https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java

public class Predict_your_age {
    public static int predictAge(int... age) {
        int result = 0;
        for (int j : age) {
            result += j * j;
        }
        return (int) Math.sqrt(result) / 2;
    }

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        System.out.println(predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }
}
