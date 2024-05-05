package kyu_6;

// https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java

public class Build_Tower {

    public static String[] towerBuilder(int nFloors) {
        if (nFloors == 0) {
            return new String[0];
        }
        String[] arr = new String[nFloors];
        StringBuilder star = new StringBuilder("*");
        StringBuilder line = new StringBuilder(" ".repeat(nFloors - 1));
        for (int i = 0; i < nFloors; i++) {
            arr[i] = line + star.toString() + line;
            star.append("**");
            line.delete(0, 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        towerBuilder(1);
    }
}
