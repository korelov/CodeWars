package kyu_8;

// https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023/train/java

public class Simple_validation_of_a_username_with_regex {

    public static boolean validateUsr(String s) {
        final String USERNAME_PATTERN =
                "^[a-z0-9\\_]{4,16}$";
        return s.matches(USERNAME_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println(validateUsr("Has"));
        System.out.println(validateUsr("regex"));
        System.out.println(validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        System.out.println(validateUsr(""));
        System.out.println(validateUsr("____"));
        System.out.println(validateUsr("asd43_34"));
    }
}
