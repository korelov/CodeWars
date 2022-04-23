package kyu_8;//https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java
import java.util.Arrays;

public class Sort_and_Star {

    public static String twoSort(String[] s) {

        Arrays.sort(s);
        String res = s[0];
        String res1 = "";
        for (int i = 0; i < res.length(); i++) {
            if (i < res.length() - 1) {
                res1 += res.charAt(i) + "***";
            } else {
                res1 += res.charAt(i);
            }
        }
        return res1;
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println(twoSort((new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"})));
    }
}
