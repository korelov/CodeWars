package kyu_8;

//https://www.codewars.com/kata/53dc23c68a0c93699800041d

public class Sentence_Smash {

    public static String smash(String... words) {
        String res = "";

        for (int i = 0; i < words.length; i++) {
            if (i < words.length-1) {
                res += words[i] + " ";
            } else {
                res += words[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(smash("Bilal", "Djaghout"));
        System.out.println(smash(new String[]{"We","Learn","Java"}));
    }
}
