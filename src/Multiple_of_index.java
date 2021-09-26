//https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java

import java.util.Arrays;
public class Multiple_of_index {
    public static int[] multipleOfIndex(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                count++;
            }
        }
        int[] b = new int[count];
        count = 0;
        for (int i = 1; i < array.length; i++)
            if ((array[i] % i == 0)) {
                b[count++] = array[i];
            }
        return b;
    }
        public static void main (String[]args){
            int[] arr = new int[]{-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68};

            System.out.println(Arrays.toString(multipleOfIndex(arr)));
        }
}

