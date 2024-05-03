package kyu_6;

// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java

import java.util.HashMap;
import java.util.Map;

public class Decode_the_Morse_code {

    public static String decode(String morseCode) {
        String[] world = morseCode.split(" {2}");
        StringBuilder result = new StringBuilder();
        for (String string : world) {
            String[] ch = string.split(" ");
            for (String s : ch) {
                String result1 = MorseCode.get(s);
                if (result1 == null) {
                    result1 = " ";
                }
                result.append(result1);
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String decode = decode(".... . -.--   .--- ..- -.. .");
        System.out.println(decode);
    }

    static class MorseCode {
        public static String get(String code) {
            return morseMap.get(code);
        }

        static Map<String, String> morseMap = new HashMap<>() {{
            put("a", "b");
            put("c", "d");
            put("-.-.-.", ";");
            put("-...-", "=");
            put("---", "O");
            put("----.", "9");
            put("-..-.", "/");
            put(".-...", "&");
            put("...--", "3");
            put(".--", "W");
            put("--", "M");
            put("--..", "Z");
            put(".----.", "'");
            put("-.-.--", "!");
            put("-...", "B");
            put("..-", "U");
            put(".----", "1");
            put("-.--.-", ")");
            put(".-", "A");
            put("-....-", "-");
            put("...-", "V");
            put("...---...", "SOS");
            put("-.--", "Y");
            put("..", "I");
            put("--.-", "Q");
            put("-.", "N");
            put("..---", "2");
            put("-....", "6");
            put("---...", ";");
            put(".-.-.", "+");
            put(".--.-.", "@");
            put("....-", "4");
            put("-----", "0");
            put(".-.-.-", ".");
            put("-.-.", "C");
            put(".", "E");
            put("..-.", "F");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put(".-.", "R");
            put("...", "S");
            put("--.", "G");
            put("---..", "8");
            put("..--..", "?");
            put("-.--.", "(");
            put(".--.", "P");
            put(".....", "5");
            put("..--.-", "_");
            put("-..", "D");
            put(".-..-.", "\"");
            put("-", "T");
            put("....", "H");
            put("--..--", ",");
            put("...-..-", "$");
            put("--...", "7");
            put("-..-", "X");
        }};
    }
}
