package kyu_6;

// https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java

public class Bouncing_Balls {

    public static int bouncingBall(double h, double bounce, double window) {
        if (window >= h || bounce >= 1 || bounce <= 0) {
            return -1;
        }
        int result = 1;
        while ((h *= bounce) > window) {
            result += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        bouncingBall(3.0, 0.66, 1.5);
        bouncingBall(30.0, 0.66, 1.5);
    }
}
