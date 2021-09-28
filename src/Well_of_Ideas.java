//https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java
public class Well_of_Ideas {

    public static String well(String[] x) {
        String result = null;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == "good") {
                count++;
            }
            if (count == 1) {
                result = "Publish!";
            }
            if (count > 2) {
                result = "I smell a series!";
            }
            if (count == 0) {
                result = "Fail!";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};
        System.out.println(well(arr));

        String[] arr1 = new String[] {"good", "bad", "bad", "bad", "bad"};
        System.out.println(well(arr1));

        String[] arr2 = new String[] {"bad", "bad", "bad"};
        System.out.println(well(arr2));
    }
}
