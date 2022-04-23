package kyu_8;

//https://www.codewars.com/kata/55ccdf1512938ce3ac000056/train/java

public class A_Strange_Trip_to_the_Market {

    public static boolean isLockNessMonster(String s) {
        return s.contains("tree fiddy") || s.contains("3.50");
    }

    public static void main(String[] args) {
        System.out.println(isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
        System.out.println(isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
    }
}
