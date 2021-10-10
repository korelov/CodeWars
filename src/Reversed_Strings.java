//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
public class Reversed_Strings {
    public static String solution(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a += str.charAt(i);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(solution("Maksim"));
    }
}
