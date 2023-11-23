package baseball.common.validate;

public class Validate {
    private static final int DIGIT_LENGTH = 3;
    private static final String ZERO = "0";
    private static final String NUMBER_PATTERN = "\\d+";
    private static final String RESTART_NUMBER = "1";
    private static final String END_NUMBER = "2";

    public static void isBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    public static void inZero(String input) {
        if (input.contains(ZERO)) {
            throw new IllegalArgumentException();
        }
    }

    public static void inText(String input) {
        if (!input.matches(NUMBER_PATTERN)) {
            throw new IllegalArgumentException();
        }
    }

    public static void notThreeDigit(String input) {
        if (input.length() != DIGIT_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public static void notOneOrTwo(String input) {
        if (!input.equals(RESTART_NUMBER) && !input.equals(END_NUMBER)) {
            throw new IllegalArgumentException();
        }
    }
}
