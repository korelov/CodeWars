package kyu_7;

// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sum_of_the_first_nth_term_of_Series {

    public static String seriesSum(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        double delimeter = 1D;
        for (int i = 0; i < n; i++) {
            sum = sum.add(new BigDecimal(1 / delimeter));
            delimeter += 3;
        }
        return sum.setScale(2, RoundingMode.HALF_UP).toString();
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
