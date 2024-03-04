package kyu_5;

//https://www.codewars.com/kata/513e08acc600c94f01000001/train/java

public class RGB_To_Hex_Conversion {

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }

    public static String rgb(int r, int g, int b) {
        String hexR = Integer.toHexString(verify(r));
        if (hexR.length() == 1) {
            hexR = "0" + hexR;
        }
        String hexG = Integer.toHexString(verify(g));
        if (hexG.length() == 1) {
            hexG = "0" + hexG;
        }
        String hexB = Integer.toHexString(verify(b));
        if (hexB.length() == 1) {
            hexB = "0" + hexB;
        }
        return (hexR + hexG + hexB).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(1, 2, 3));
        System.out.println(rgb(-20, 275, 125));
    }
}
