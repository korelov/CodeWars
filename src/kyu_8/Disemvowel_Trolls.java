package kyu_8;

// https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java

public class Disemvowel_Trolls {
    public static String disemvowel(String str) {
       return str.replaceAll("[AaEeIiOoUu]","");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel(
                "No offense but,Your writing is among the worst I've ever read"));
    }
}
