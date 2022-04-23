package kyu_8;

//https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
public class ReversedWords {
    public static String reverseWords(String str) {

        String[] arr = str.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                res += arr[arr.length - i - 1] + " ";
            } else {
                res += arr[arr.length - i - 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
        System.out.println(reverseWords("I like flying"));
        System.out.println(reverseWords("The world is nice"));
    }
}
