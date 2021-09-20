//https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java

import java.util.Arrays;

public class Grasshopper {
    public static int summation(int n) {
        int sum = 0;
        for(int i = 0; i <=n; i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
    }
}
