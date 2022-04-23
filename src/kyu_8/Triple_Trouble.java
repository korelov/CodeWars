package kyu_8;

//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
public class Triple_Trouble {
    public static String tripleTrouble(String one, String two, String three) {

        String[] arr1 = one.split("");
        String[] arr2 = two.split("");
        String[] arr3 = three.split("");
        String res = "";
        for (int i = 0; i < one.length(); i++) {
            res += arr1[i] + arr2[i] + arr3[i];

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }
}
