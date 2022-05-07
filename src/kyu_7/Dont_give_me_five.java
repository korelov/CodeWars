package kyu_7;

// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java

public class Dont_give_me_five {
    public static int dontGiveMeFive(int start, int end) {

        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
            if (Integer.toString(i).contains("5")) {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(dontGiveMeFive(-16, 6));
        System.out.println(dontGiveMeFive(4, 17));
        System.out.println(dontGiveMeFive(1, 9));
    }
}
