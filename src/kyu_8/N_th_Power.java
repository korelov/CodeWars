package kyu_8;

//https://www.codewars.com/kata/57d814e4950d8489720008db/train/java
public class N_th_Power {
    public static int nthPower(int[] array, int n) {
        int res = 0;
        if(n > array.length-1){
            res = -1;
        }
        for (int i = 0 ; i < array.length;i++){
            if(i==n){
                res = (int)Math.pow(array[i],n);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(nthPower(new int[] {1,2}, 2));
        System.out.println(nthPower(new int[] {3,1,5,2}, 2));
        System.out.println(nthPower(new int[] {3,1,2}, 2));
    }
}

