package kyu_8;

// https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java

public class Printing_Array_elements_with_Comma_delimiters {
    public static String printArray(Object[] array) {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                res += array[i];
            } else {
                res += array[i] + ",";
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String[] array=new String[]{"2","4","5","2"};
        Integer[] array1=new Integer[]{2,4,5,2};

        System.out.println(printArray(array));
        System.out.println(printArray(array1));
    }
}
