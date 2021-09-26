import java.util.Arrays;

public class Find_numbers_which_are_divisible_by_given_number {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % divider == 0) {
                arr[count++] = numbers[j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6};
        int b = 2;
        int[] a1 = new int[] {1,2,3,4,5,6};
        int b1 = 3;
        int[] a2 = new int[] {0,1,2,3,4,5,6};
        int b2 = 4;
        System.out.println(Arrays.toString(divisibleBy(a,b)));
        System.out.println(Arrays.toString(divisibleBy(a1,b1)));
        System.out.println(Arrays.toString(divisibleBy(a2,b2)));
    }
}
