package kyu_7;

//https://www.codewars.com/kata/557af4c6169ac832300000ba

import java.util.Arrays;

public class Help_the_Fruit_Guy {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) {
            return new String[]{};
        }
        String[] res = new String[fruitBasket.length];
        for (int i = 0; i < fruitBasket.length; i++) {
            res[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] rotten = new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"};
        String[] expected = new String[]{"apple", "banana", "apple", "pineapple", "kiwi"};
        System.out.println(Arrays.toString(removeRotten(rotten)));


    }

}
