package kyu_7;

// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java

public class Credit_Card_Mask {

    public static String maskify(String str) {
        String res = "";
        if (str.length() <= 3) {
            return str;
        }
        int a = 4;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - a) {
                res += str.charAt(i);
                a--;
            } else {
                res += "#";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maskify("korelov"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("V{>"));
    }
}
