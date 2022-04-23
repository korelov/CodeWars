package kyu_8;//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java

public class Find_the_position {
    public static String position(char alphabet) {
        String alphavite = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] array = alphavite.split(" ");
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == alphabet) {
                index = i+1;
            }
        }
        return "Position of alphabet: " + index;
    }

    public static void main(String[] args) {
        System.out.println(position('b'));
        System.out.println(position('z'));
        System.out.println(position('g'));
    }
}

