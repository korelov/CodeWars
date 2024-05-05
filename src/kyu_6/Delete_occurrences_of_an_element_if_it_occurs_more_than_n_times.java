package kyu_6;

// https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java

import java.util.*;

public class Delete_occurrences_of_an_element_if_it_occurs_more_than_n_times {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>(Arrays.stream(elements).boxed().toList());
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : elements) {
            map.put(element, map.getOrDefault(element, 0) + 1);
            int count = map.get(element) - maxOccurrences;
            if (count > 0) {
                list.remove(list.lastIndexOf(element));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 1)));
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)));
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 1, 1, 1}, 5)));
        System.out.println(Arrays.toString(deleteNth(new int[]{}, 5)));
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
    }
}
