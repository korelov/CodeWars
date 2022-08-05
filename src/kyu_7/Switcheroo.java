package kyu_7;

//https://www.codewars.com/kata/57f759bb664021a30300007d/train/java

public class Switcheroo {
    public static String switcheroo(String x) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                result.append("b");
            } else if (x.charAt(i) == 'b') {
                result.append("a");
            } else {
                result.append(x.charAt(i));
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(switcheroo("bac"));
        System.out.println(switcheroo("ccc"));
        System.out.println(switcheroo("bbbacccabbb"));
    }
}
