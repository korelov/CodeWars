package kyu_7;

//https://www.codewars.com/kata/5d50e3914861a500121e1958/train/java

public class Alphabetical_Addition {
    public static String addLetters(String... letters) {
        if (letters == null || letters.length == 0) {
            return "z";
        }
        int temp = 25;
        for (String letter : letters) {
            temp += letter.charAt(0) - 96;
        }
        char x = (char) ((temp) % 26 + 97);
        return "" + x ;
    }

    public static void main(String[] args) {

        System.out.println(addLetters("a", "b", "c"));
        System.out.println(addLetters("a", "b"));
        System.out.println(addLetters("c"));
        System.out.println(addLetters("z", "a"));
        System.out.println(addLetters("y", "c", "b"));
        System.out.println(addLetters());
    }
}
