package kyu_7;

// https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145/train/java

public class Bingo_Or_Not {

    public static String bingo(int[] numberArray) {
        // BINGO    2  9  14  7  15
        int countB = 0;
        int countI = 0;
        int countN = 0;
        int countG = 0;
        int countO = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 2) {
                countB++;
            } else if (numberArray[i] == 9) {
                countI++;
            } else if (numberArray[i] == 14) {
                countN++;
            } else if (numberArray[i] == 7) {
                countG++;
            } else if (numberArray[i] == 15) {
                countO++;
            }
        }
        if (countB != 0 && countI != 0 && countN != 0 && countG != 0 && countO != 0) {
            return "WIN";
        } else {
            return "LOSE";
        }
    }


    public static void main(String[] args) {
        System.out.println(bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 9, 10}));
        System.out.println(bingo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
