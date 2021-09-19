//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java

public class WhatIsBetween {
    public static int[] between(int a, int b) {

        int[] arr = new int[(b-a)+1];
        for(int i = 0 ; i <= b-a ;i++ ){
            arr[i]= i+a;
        }
        return arr;
    }
    public static void main(String[] args) {
        int s = 1, g = 4;
        System.out.println(between(s,g));
    }
}
