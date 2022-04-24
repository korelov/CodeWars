package kyu_8;

// https://www.codewars.com/kata/53f1015fa9fe02cbda00111a/train/java

class Ghost {
    static String[] arr = {"white", "yellow", "purple", "red"};
    String color;

    public String getColor() {
        return color;
    }

    Ghost() {
        this.color = arr[(int) (Math.random() * (4 - 0) + 0)];
    }
}

public class Color_Ghost {
    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
    }
}
