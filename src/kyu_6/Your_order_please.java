package kyu_6;

//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

public class Your_order_please {
    public static String order(String words) {
        StringBuilder res = new StringBuilder();
        String[] strings = words.split(" ");
        int position = 1;
        int count = 0;
        while (count < strings.length) {
            if (count == strings.length - 1) {
                for (String string : strings) {
                    if (string.contains(Integer.toString(position))) {
                        res.append(string);
                    }
                }
            } else {
                for (String string : strings) {
                    if (string.contains(Integer.toString(position))) {
                        res.append(string).append(" ");
                    }
                }
            }
            position++;
            count++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
