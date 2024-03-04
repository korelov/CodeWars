package kyu_7;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

import java.util.ArrayList;
import java.util.List;

public class List_Filtering {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> objects = new ArrayList<>();
        for (Object o : list) {
            if (!(o instanceof String)) {
                objects.add(o);
            }
        }
        return objects;
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
        System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));

    }
}
