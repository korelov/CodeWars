package kyu_6;

// https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java

public class Find_the_missing_letter {

    public static char findMissingLetter(char[] array) {
        int c = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] > 1) {
                c = array[i] - 1;
            }
        }
        return (char) c;
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
