package other.tasks.tasks;

import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private static void checkNecklace(List<Integer> neck) {
        if (neck.size() % 2 != 0) {
            throw new IllegalArgumentException("Нечетное ожерелье");
        }
        List<Integer> humanOne = new ArrayList<>();
        int humanOneDiamond = 0;
        int humanOneEmerald = 0;
        List<Integer> humanTwo = new ArrayList<>();
        int humanTwoDiamond = 0;
        int humanTwoEmerald = 0;

        for (Integer stone : neck) {
            if (stone == 0) {
                if (humanOneDiamond == humanTwoDiamond) {
                    humanOne.add(stone);
                    humanOneDiamond++;
                    continue;
                }
                if (humanOneDiamond > humanTwoDiamond) {
                    humanTwo.add(stone);
                    humanTwoDiamond++;
                } else {
                    humanOne.add(stone);
                    humanOneDiamond++;
                }
            } else {
                if (humanOneEmerald == humanTwoEmerald) {
                    humanOne.add(stone);
                    humanOneEmerald++;
                    continue;
                }
                if (humanOneEmerald > humanTwoEmerald) {
                    humanTwo.add(stone);
                    humanTwoEmerald++;
                } else {
                    humanOne.add(stone);
                    humanOneEmerald++;
                }
            }
        }
        if (humanOne.size() != humanTwo.size()) {
            throw new IllegalArgumentException("Поделить поровну не получилось");
        }
        printResult(humanOne, humanOneDiamond, humanOneEmerald);
        printResult(humanTwo, humanTwoDiamond, humanTwoEmerald);
    }

    private static void printResult(List<Integer> humanBag, int diamondCount, int emeraldCount) {
        System.out.printf("У человека в сумке %d алмаза(ов), %d изумруда(ов), содержание сумки %s\n"
                , diamondCount, emeraldCount, humanBag);
    }

    public static void main(String[] args) {
//        проверка на нечетное ожерелье
//        List<Integer> oddNecklace = List.of(0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0);
//        checkNecklace(oddNecklace);

        List<Integer> integerList = List.of(0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0);
        checkNecklace(integerList);

        List<Integer> integerList1 = List.of(0, 0, 1, 1);
        checkNecklace(integerList1);

        List<Integer> integerList2 = List.of(0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        checkNecklace(integerList2);
    }
}
