package kyu_8;

// https://www.codewars.com/kata/56530b444e831334c0000020/train/java

public class Determine_offspring_sex {

    public static String chromosomeCheck(String sperm) {
     String son = "Congratulations! You're going to have a son.";
     String daughter = "Congratulations! You're going to have a daughter.";

     if(sperm.contains("XY")){
         return son;
     } else {
         return daughter;
     }
    }

    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XY"));
        System.out.println(chromosomeCheck("XX"));
    }
}
