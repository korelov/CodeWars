package kyu_8;

// https://www.codewars.com/kata/57faf7275c991027af000679/train/java

public class Remove_n_exclamation_marks_in_the_sentence_from_left_to_right {

    public static String remove(String s, int n) {

        for (int i = 0; i < n; i++)
            s = s.replaceFirst("!", "");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(remove("Hi!", 1));
        System.out.println(remove("!!!Hi !!hi!!! !hi", 1));
        System.out.println(remove("!Hi", 1));
        System.out.println(remove("Hi!!!", 100));
        System.out.println(remove("!!!Hi !!hi!!! !hi", 100));
    }
}
