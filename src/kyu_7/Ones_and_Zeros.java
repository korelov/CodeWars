package kyu_7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

public class Ones_and_Zeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder listString = new StringBuilder();
        for (Integer integer : binary) {
            listString.append(integer);
        }
        BigInteger bigInteger = new BigInteger(listString.toString(), 2);
        return Integer.parseInt(bigInteger.toString());
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt((new ArrayList<>(Arrays.asList(1, 1, 1, 1)))));
        System.out.println(ConvertBinaryArrayToInt((new ArrayList<>(Arrays.asList(0,1,1,0)))));
    }


}
