package kyu_7;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

public class Isograms {
    public static boolean isIsogram(String str) {
        if (str.length() == 0) {
            return true;
        }
        String temp = str.toLowerCase();
        boolean result = true;
        for (int i = 0; i < temp.length(); i++) {
            int count = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(i) == temp.charAt(j)) {
                    count++;
                }
                if (count > 1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }
}
