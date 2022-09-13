package kyu_8;

//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java

public class Simple_Fun_176_Reverse_Letter {

    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^A-Za-z]", "")).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("krishan"));
        System.out.println(reverseLetter("ultr53o?n"));
    }

}
