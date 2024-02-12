package other.tasks.calc;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Калькулятор римских и десятичных цифр.
 * Пользовательский ввод - цифра оператор цифра.
 * -пробел не учитывается, можно с пробелом и без.
 * -по десятичным нет ограничений.
 * -по римским ограничения от 1 до 10.
 * -учтена возможность ввода первой римской цифры меньше второй.
 * - преобразование римских цифр от 1 до 100, включительно.
 */
public class Calc {
    private static final Scanner scanner = new Scanner(System.in);
    private final List<String> rome
            = List.of("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public void input() {
        System.out.println("Формат ввода - число операция число");
        String input = scanner.nextLine().replace(" ", "");
        String operator = checkOperator(input);
        String numberOne = input.substring(0, input.indexOf(operator));
        String numberTwo = input.substring(input.indexOf(operator) + 1);

        if (numberOne.matches("^\\d+$") && numberTwo.matches("^\\d+$")) {
            int calculate = calculate(Integer.parseInt(numberOne), Integer.parseInt(numberTwo), operator);
            System.out.printf("Результат %s = %d", operator, calculate);
        } else {
            checkRomeNumber(numberOne, numberTwo);
            int numberOneDig = rome.indexOf(numberOne);
            int numberTwoDig = rome.indexOf(numberTwo);
            if (numberOneDig < numberTwoDig) {
                int temp = numberOneDig;
                numberOneDig = numberTwoDig;
                numberTwoDig = temp;
            }
            int calculate = calculate(numberOneDig, numberTwoDig, operator);
            if (calculate < 1) {
                throw new NumberFormatException("Римские цифры не могут быть меньше единицы");
            }
            System.out.printf("Результат %s = %s", operator, toRoman(calculate));
        }
    }

    private String checkOperator(String input) {
        String operator = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+'
                    || input.charAt(i) == '-'
                    || input.charAt(i) == '/'
                    || input.charAt(i) == '*') {
                operator = String.valueOf(input.charAt(i));
            }
        }
        if (operator.isEmpty()) {
            throw new NoSuchElementException("Отсутствует бинарный оператор");
        }
        return operator;
    }

    private void checkRomeNumber(String numberOne, String numberTwo) {
        if (!rome.contains(numberOne) || !rome.contains(numberTwo)) {
            throw new IllegalArgumentException("Ошибка в вводе римских цифр");
        }
    }

    private int calculate(int numberOne, int numberTwo, String operator) {
        return switch (operator) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "/" -> {
                if (numberTwo == 0) {
                    throw new IllegalArgumentException("Деление на ноль");
                }
                yield numberOne / numberTwo;
            }
            case "*" -> numberOne * numberTwo;
            default -> 0;
        };
    }

    private String toRoman(int number) {
        return "I".repeat(number)
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C");
    }
}