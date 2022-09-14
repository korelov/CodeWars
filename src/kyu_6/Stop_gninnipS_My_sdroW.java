package kyu_6;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

public class Stop_gninnipS_My_sdroW {

    public static String spinWords(String sentence) {
        String[] temp = sentence.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() >= 5) {
                temp[i] = new StringBuilder(temp[i]).reverse().toString();
            }
        }
        return String.join(" ",temp);
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is another test"));
    }
}
