//https://www.codewars.com/kata/56c5847f27be2c3db20009c3/train/java
public class Subtract_the_Sum {

    public static String subtractSum(int n) {
        int result;
        int sum = 0;
        if (n >= 10 && n < 10000) {
            String temp = Integer.toString(n);
            for (int i = 0; i < temp.length(); i++) {
                sum += temp.charAt(i) - 48;
            }
            result = n - sum;
            while ((result) >= 100) {
                String temp1 = Integer.toString(result);
                for (int i = 0; i < temp1.length(); i++) {
                    sum += temp1.charAt(i) - 48;
                }
                result = n - sum;
            }
        } else {
            result = n;
        }

        String[] fruits =
                {"kiwi",
                        "pear",
                        "kiwi",
                        "banana",
                        "melon",
                        "banana",
                        "melon",
                        "pineapple",
                        "apple",
                        "pineapple",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "grape",
                        "orange",
                        "grape",
                        "apple",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "apple",
                        "melon",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "apple",
                        "orange",
                        "grape",
                        "orange",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "apple",
                        "pear",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "apple",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "cucumber",
                        "orange",
                        "grape",
                        "cherry",
                        "apple",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "kiwi",
                        "pear",
                        "kiwi",
                        "banana",
                        "apple",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "pineapple",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "apple",
                        "grape",
                        "orange",
                        "grape",
                        "cherry",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "apple",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "banana",
                        "melon",
                        "banana",
                        "melon",
                        "pineapple",
                        "apple",
                        "pineapple"};
        return fruits[result - 1];
    }

    public static void main(String[] args) {
        System.out.println(subtractSum(4));
        System.out.println(subtractSum(10));
        System.out.println(subtractSum(112));
    }
}
