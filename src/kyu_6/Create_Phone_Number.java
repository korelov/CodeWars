package kyu_6;

//https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

public class Create_Phone_Number {
    public static String createPhoneNumber(int[] numbers) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                res = new StringBuilder("(" + numbers[i]);
            } else if (i == 2) {
                res.append(numbers[i]).append(") ");
            } else if (i == 5) {
                res.append(numbers[i]).append("-");
            } else {
                res.append(numbers[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
