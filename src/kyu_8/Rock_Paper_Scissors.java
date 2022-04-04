package kyu_8;
// https://www.codewars.com/kata/5672a98bdbdd995fad00000f/java

public class Rock_Paper_Scissors {

    public static String rps(String p1, String p2) {
        String res = "";

        if (p1 == p2) {
            res = "Draw!";
        }
        if (p1.equals("scissors")) {
            if (p2.equals("paper")) {
                res = "Player 1 won!";
            }
            if (p2.equals("rock")) {
                res = "Player 2 won!";
            }
        }
        if (p1.equals("paper")) {
            if (p2.equals("rock")) {
                res = "Player 1 won!";
            }
            if (p2.equals("scissors")) {
                res = "Player 2 won!";
            }
        }
        if (p1.equals("rock")) {
            if (p2.equals("scissors")) {
                res = "Player 1 won!";
            }
            if (p2.equals("paper")) {
                res = "Player 2 won!";
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("scissors", "rock"));

        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("paper", "rock"));

        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("rock", "paper"));

        System.out.println(rps("paper", "paper"));
    }
}
