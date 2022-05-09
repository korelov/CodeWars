package kyu_8;

//https://www.codewars.com/kata/55d8618adfda93c89600012e/train/java

public class How_do_I_compare_numbers {

    static final Object[][] specialNumbers = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String) p[1];
        }
        return "nothing";
    }

    public static void main(String[] args) {

        System.out.println(whatIs(42));
        System.out.println(whatIs(0));
        System.out.println(whatIs(123));
    }
}
