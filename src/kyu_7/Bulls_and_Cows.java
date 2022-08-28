package kyu_7;

//https://www.codewars.com/kata/5be1a950d2055d589500005b/train/java

import java.util.HashSet;
import java.util.Set;

class BullsAndCows {

    int secret;
    int count = 8;
    boolean win = false;

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean checkNumber(int n) {
        Set<Integer> set = new HashSet<>();
        char[] chars = (n + "").toCharArray();
        for (int digit : chars) {
            set.add(digit);
        }
        if (n < 1000 || n > 9999 || set.size() != 4) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public BullsAndCows(int n) {
        if (checkNumber(n)) {
            this.secret = n;
        }
    }

    public String compareWith(int n) {
        String number = Integer.toString(n);
        String result = "";
        if (number.length() != 4) {
            throw new IllegalArgumentException();
        }
        if (isWin()) {
            return "You already won!";
        }
        if (getCount() == 0) {
            return "Sorry, you're out of turns!";
        }
        setCount(count - 1);
        checkNumber(n);
        String SECRET_CODE = Integer.toString(secret);

        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < SECRET_CODE.length(); j++) {
                if (number.charAt(i) == SECRET_CODE.charAt(j)) {
                    if (i == j) {
                        bulls++;
                    } else {
                        cows++;
                    }
                }
            }
        }
        if (bulls == 1 && cows == 1) {
            result = String.format("%d bull and %d cow", bulls, cows);
        } else if (bulls == 1) {
            result = String.format("%d bull and %d cows", bulls, cows);
        } else if (cows == 1) {
            result = String.format("%d bulls and %d cow", bulls, cows);
        } else {
            result = String.format("%d bulls and %d cows", bulls, cows);
        }
        if (bulls == SECRET_CODE.length()) {
            result = "You win!";
            setWin(true);
        }
        return result;
    }
}

public class Bulls_and_Cows {

    public static void main(String[] args) {
        BullsAndCows bac = new BullsAndCows(1234);

        for (int i = 0; i < 8; i++) {
            System.out.println(bac.compareWith(1234 + 1));
        }
        System.out.println(bac.compareWith(1111));
    }
}
