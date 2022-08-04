package kyu_7;

// https://www.codewars.com/kata/5a87449ab1710171300000fd/train/java

public class Tidy_Number {

    public static boolean tidyNumber(int number) {

        String[] str = Integer.toString(number).split("");

        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i - 1]) > Integer.parseInt(str[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(tidyNumber(12));
        System.out.println(tidyNumber(32));
        System.out.println(tidyNumber(39));
        System.out.println(tidyNumber(1024));
        System.out.println(tidyNumber(12576));
        System.out.println(tidyNumber(13579));
        System.out.println(tidyNumber(2335));
    }
}
