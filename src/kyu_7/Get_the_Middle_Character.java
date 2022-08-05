package kyu_7;

//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

public class Get_the_Middle_Character {
    public static String getMiddle(String word) {
        int length = word.length();

        if (length == 1) {
            return word;
        }
        if (length % 2 == 0) {
            return word.charAt(length / 2 - 1) + "" + word.charAt(length / 2);
        } else {
            return word.charAt(length / 2) + "";
        }
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("testing"));
    }
}
