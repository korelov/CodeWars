package kyu_7;

//https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/train/java

public class Coloured_Triangles {

    public static char triangle(final String row) {
        int[] temp = new int[row.length()];
        for (int i = 0; i < row.length(); i++) {
            temp[i] = row.charAt(i) - 64;
        }
        if(temp.length==1){
            return (char) (temp[0] + 64);
        }
        int[] res = array(temp);
        if (res.length > 2) {
            do {
                res = array(res);
            } while (res.length != 1);
        }
        return (char) (res[0] + 64);
    }

    public static int[] array(int[] arr) {

        int[] temp1 = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i - 1] - arr[i]) == 0) {
                temp1[i - 1] = arr[i];
            } else if (Math.abs(arr[i - 1] - arr[i]) == 5) {
                temp1[i - 1] = 18;
            } else if (Math.abs(arr[i - 1] - arr[i]) == 11) {
                temp1[i - 1] = 2;
            } else if (Math.abs(arr[i - 1] - arr[i]) == 16) {
                temp1[i - 1] = 7;
            }
        }
        return temp1;
    }


    public static void main(String[] args) {
        //R = 18  G= 7  B = 2
        System.out.println(triangle("RGBG"));
        System.out.println(triangle("RRGBRGBB"));
        System.out.println(triangle("GB"));
        System.out.println(triangle("RRR"));
        System.out.println(triangle("RBRGBRBGGRRRBGBBBGG"));
    }
}
