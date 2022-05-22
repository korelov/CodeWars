package kyu_7;

// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java

public class Round_up_to_the_next_multiple_of_5 {
    public static int roundToNext5(int number) {
        Math.abs(number);
        while (true) {
            if (number % 5 == 0) {
                break;
            } else {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(roundToNext5(21));
    }
}
