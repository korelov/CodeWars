package kyu_8;

//https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
public class Fake_Binary {
    public static String fakeBin(String numberString) {
        String res = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) - 48 < 5) {
                res += "0";
            } else {
                res += "1";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin("509321967506747"));
        System.out.println(fakeBin("366058562030849490134388085"));
    }
}
