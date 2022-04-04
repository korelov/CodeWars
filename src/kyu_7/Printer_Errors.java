package kyu_7;

//https://www.codewars.com/kata/56541980fa08ab47a0000040

public class Printer_Errors {

    public static String printerError(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) > 109) {
                count++;
            }
        }
        return count + "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }
}
