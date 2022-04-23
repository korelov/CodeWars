package kyu_8;//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

public class If_you_cant_sleep_just_count_sheep {
    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1 ; i <= num; i++){
            sheep += i + " sheep...";
        }
        return sheep;
    }

    public static void main(String[] args) {
        String x = countingSheep(3);
        System.out.println(x);
    }
}
