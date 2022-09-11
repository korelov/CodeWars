package kyu_7;

//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

public class Shortest_Word {
    public static int findShort(String s) {
        String[] temp = s.split(" ");
        int min = Integer.MAX_VALUE;
        for (String value : temp) {
            if (value.length() < min) {
                min = value.length();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }

}
