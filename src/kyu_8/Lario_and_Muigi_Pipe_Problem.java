package kyu_8;

import java.util.Arrays;
//https://www.codewars.com/kata/56b29582461215098d00000f/train/java
public class Lario_and_Muigi_Pipe_Problem {
    public static int[] pipeFix(int[] numbers) {

        int a = numbers[0];
        int b = numbers[numbers.length-1];
        int[] res = new int[b-a+1];
        int count = 0;
        for (int i = a ; i <= b; i++){
            res[count++]+=i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[] {1,2,3,5,6,8,9})));
        System.out.println(Arrays.toString(pipeFix(new int[] {1,2,3,12})));
        System.out.println(Arrays.toString(pipeFix(new int[] {6,9})));
        System.out.println(Arrays.toString(pipeFix(new int[] {-1,4})));
        System.out.println(Arrays.toString(pipeFix(new int[] {1,2,3})));
    }
}