package kyu_8;

//https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/java

public class Is_he_gonna_survive {

    public static boolean hero(int bullets, int dragons) {
        return bullets / dragons > 1;
    }

    public static void main(String[] args) {
        System.out.println(hero(10,5));
        System.out.println(hero(100,40));
        System.out.println(hero(7,4));
    }
}
