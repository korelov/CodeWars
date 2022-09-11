package kyu_7;

//https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java

public class Build_a_square {
    public static final String generateShape(int n) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 && i != n - 1) {
                    result.append("+").append("\n");
                } else {
                    result.append("+");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println(generateShape(5));
        System.out.println(generateShape(8));
    }
}
