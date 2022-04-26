package kyu_8;

// https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_My_Textbooks {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks);
        return textbooks;
    }

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Algebra", "history", "Geometry", "english"})
            strs.add(s);

        System.out.println(sort(strs));
    }

}
