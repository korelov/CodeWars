package kyu_6;

// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

public class Highest_Scoring_Word {

    public static String high(String s) {
        String[] list = s.split(" ");
        String result = "";
        int sumMax = 0;
        for (String value : list) {
            int sum = 0;
            for (int j = 0; j < value.length(); j++) {
                sum += value.charAt(j) - 96;
            }
            if (sum == sumMax) {
                continue;
            }
            if (sum > sumMax) {
                sumMax = sum;
                result = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(high("take me to semynak"));
    }
}
