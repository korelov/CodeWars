package kyu_8;

// https://www.codewars.com/kata/56598d8076ee7a0759000087

public class Tip_Calculator {

    public static Integer calculateTip(double amount, String rating) {

        int res = 0;
        String rating1 = rating.toLowerCase();
        switch (rating1) {
            case ("terrible"):
                res = (int) Math.ceil(amount * 0);
                break;
            case ("poor"):
                res = (int) Math.ceil(amount * 0.05);
                break;
            case ("good"):
                res = (int) Math.ceil(amount * 0.1);
                break;
            case ("great"):
                res = (int) Math.ceil(amount * 0.15);
                break;
            case ("excellent"):
                res = (int) Math.ceil(amount * 0.2);
                break;
            default:
                return null;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(calculateTip(107.65, "GReat"));
        System.out.println(calculateTip(20d, "hi"));
        System.out.println(calculateTip(32, "terrible"));
    }
}
