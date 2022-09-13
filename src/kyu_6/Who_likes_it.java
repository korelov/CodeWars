package kyu_6;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

public class Who_likes_it {
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return String.format("%s likes this", names[0]);
        } else if (names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        } else if (names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        } else {
            return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt(whoLikesIt("Peter")));
        System.out.println(whoLikesIt(whoLikesIt("Jacob", "Alex")));
        System.out.println(whoLikesIt(whoLikesIt("Max", "John", "Mark")));
        System.out.println(whoLikesIt(whoLikesIt("Alex", "Jacob", "Mark", "Max")));
    }
}
