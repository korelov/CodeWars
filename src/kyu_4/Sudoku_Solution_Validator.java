package kyu_4;

//https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java

import java.util.Arrays;

public class Sudoku_Solution_Validator {

    public static boolean check(int[][] sudoku) {
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int[] square = new int[9];
            for (int j = 0; j < 9; j++) {
                square[j] = sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }
            Arrays.sort(square);
            for (int j = 1; j < square.length; j++) {
                if (square[j - 1] == 0) {
                    count++;
                }
                if (count > 0) {
                    return false;
                }
                if (square[j] == square[j - 1]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 1; j < sudoku[i].length; j++) {
                if (sudoku[i][j - 1] == sudoku[i][j]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 1; j < sudoku[i].length; j++) {
                if (sudoku[j][i] == sudoku[j - 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {


        int[][] arr = new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};


        System.out.println(check(arr));

        arr[0][0]++;
        arr[1][1]++;
        arr[0][1]--;
        arr[1][0]--;

        System.out.println(check(arr));

        arr[0][0]--;
        arr[1][1]--;
        arr[0][1]++;
        arr[1][0]++;

        arr[4][4] = 0;

        System.out.println(check(arr));
    }
}
