package baseball.common.validate;

public class Validate {
    public static void isBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    public static void inZero(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException();
        }
    }

    public static void inText(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException();
        }
    }

    public static void notThreeDigit(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public static void notOneOrTwo(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException();
        }
    }
}
