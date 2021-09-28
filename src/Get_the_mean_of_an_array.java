import java.util.Arrays;

//https://www.codewars.com/kata/563e320cee5dddcf77000158
public class Get_the_mean_of_an_array {
    public static int getAverage(int[] marks) {

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 2, 2};
        System.out.println(getAverage(a));

        int[] a1 = new int[]{2, 5, 13, 20, 16, 16, 10};
        System.out.println(getAverage(a1));

        int[] a2 = new int[]{1, 2, 15, 15, 17, 11, 12, 17, 17, 14, 13, 15, 6, 11, 8, 7};
        System.out.println(getAverage(a2));
    }
}
