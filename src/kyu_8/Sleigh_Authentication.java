package kyu_8;

// https://www.codewars.com/kata/52adc142b2651f25a8000643/train/java

public class Sleigh_Authentication {

    public static Boolean authenticate(String name, String password){
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }


    public static void main(String[] args) {
        System.out.println(authenticate("Santa Claus", "Ho Ho Ho!"));
        System.out.println(authenticate("Santa", "Ho Ho Ho!"));
        System.out.println(authenticate("Santa Claus", "Ho Ho Ho"));
    }
}
