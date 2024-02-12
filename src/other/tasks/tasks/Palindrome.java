package other.tasks.tasks;

import java.util.List;

public class Palindrome {

    private static boolean palindromeOne(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        String lowerCase = string.replaceAll("[^а-яА-Яa-zA-Z]", "").toLowerCase();
        String temp = "";
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            temp += lowerCase.charAt(i);
        }
        return temp.equals(lowerCase);
    }

    private static boolean palindromeTwo(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        String lowerCase = string.replaceAll("[^а-яА-Яa-zA-Z]", "").toLowerCase();
        String stringBuilderReverse = new StringBuilder(lowerCase).reverse().toString();
        return stringBuilderReverse.equals(lowerCase);
    }

    public static void main(String[] args) {
        List<String> stringListPalindrome = List.of("А роза упала на лапу Азора",
                "А роза упала на лапу Азора",
                "А в Енисее — синева",
                "А муза рада музе без ума да разума",
                "А щётка – как тёща!",
                "Вот сила типа капиталистов",
                "Громилы мыли морг",
                "Дорого небо, да надобен огород",
                "Мама мыла раму и учила Java");

        System.out.println(palindromeOne(null));
        System.out.println(palindromeOne(""));
        for (String string : stringListPalindrome) {
            System.out.println("Это палиндром (вариант один) " + palindromeOne(string));
            System.out.println("Это палиндром (вариант два) " + palindromeTwo(string));
        }
    }
}
