package kyu_6;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

public class Detect_Pangram {

    public static boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase().replaceAll("[ .!]", "");
        boolean res = true;
        for (int i = 0; i < alphabet.length(); i++) {
            if (!sentence.contains(alphabet.charAt(i) + "")) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

}
