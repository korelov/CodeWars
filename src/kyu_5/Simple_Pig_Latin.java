package kyu_5;

//https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

public class Simple_Pig_Latin {
    public static String pigIt(String str) {
        String[] arr = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 1 && i == arr.length - 1) {
                res.append(arr[i]);
            }
            if (arr[i].length() == 1 && arr.length - 1 != i) {
                res.append(arr[i]).append("ay ");
            }
            for (int j = 1; j < arr[i].length(); j++) {
                if (i == arr.length - 1) {
                    if (j == arr[i].length() - 1) {
                        res.append(arr[i].charAt(j)).append(arr[i].charAt(0)).append("ay");
                    } else {
                        res.append(arr[i].charAt(j));
                    }
                } else {
                    if (j == arr[i].length() - 1) {
                        res.append(arr[i].charAt(j)).append(arr[i].charAt(0)).append("ay ");
                    } else {
                        res.append(arr[i].charAt(j));
                    }
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
        System.out.println(pigIt("O emporatay oay oresmay !"));
    }

}
