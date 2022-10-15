package kyu_6;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

public class Duplicate_Encoder {

    static String encode(String word) {

        String wordLow = word.toLowerCase();
        StringBuilder result = new StringBuilder();

        int count;
        for (int i = 0; i < wordLow.length(); i++) {
            count = 0;
            for (int j = 0; j < wordLow.length(); j++) {
                if (wordLow.charAt(i) == wordLow.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(encode("Prespecialized"));
        System.out.println(encode("din"));
        System.out.println(encode("   ()(   "));
        System.out.println(encode("recede"));
        System.out.println(encode("(( @"));
    }
}
