package kyu_6;

//https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

public class Take_a_Ten_Minutes_Walk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int x = 0;
        int y = 0;
        for (char c : walk) {
            if (c == 'n') {
                y++;
            } else if (c == 's') {
                y--;
            } else if (c == 'w') {
                x++;
            } else if (c == 'e') {
                x--;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[]{'w'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
