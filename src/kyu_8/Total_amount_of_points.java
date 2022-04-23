package kyu_8;

//https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
public class Total_amount_of_points {

    public static int points(String[] games) {
        int res = 0;

        for (int i = 0; i < games.length; i++) {

            if (games[i].charAt(0) > games[i].charAt(2)) {
                res += 3;
            } else if (games[i].charAt(0) < games[i].charAt(2)) {
                res += 0;
            } else if (games[i].charAt(0) == games[i].charAt(2)) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
        System.out.println(points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
        System.out.println(points(new String[]
                {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}));
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"}));
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"}));
    }
}