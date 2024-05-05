package kyu_6;

//  https://www.codewars.com/kata/583203e6eb35d7980400002a/java

import java.util.ArrayList;
import java.util.List;

public class Count_the_smiley_faces {


    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String string : arr) {
            if (string.matches("[:;]{1}[-~]{0,1}[)D]{1}")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");
        System.out.println(countSmileys(a));

        List<String> b =  new ArrayList<String>();
        b.add(":)"); b.add(":)"); b.add("x-]"); b.add(":ox"); b.add(";-("); b.add(";-)"); b.add(";~("); b.add(":~D");
        System.out.println(countSmileys(b));

    }
}
