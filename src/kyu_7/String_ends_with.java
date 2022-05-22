package kyu_7;

// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

public class String_ends_with {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("samurai", "ra"));
        System.out.println(solution("!@#$%^&*() :-)", ":-)"));
    }
}
