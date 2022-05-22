package kyu_7;

// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class Regex_validate_PIN_code {
    public static boolean validatePin(String pin) {

        int character = pin.replaceAll("[^a-zA-Z]", "").length();
        int digWorld = pin.replaceAll("[^\\W]", "").length();
        if (pin.length() < 4 || pin.length() > 6 || pin.length() == 5 || character > 0 || digWorld > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1212Ads*&^,."));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("09099"));
    }
}
