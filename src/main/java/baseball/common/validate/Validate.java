package baseball.common.validate;

import baseball.common.constant.GameRule;

public class Validate {
    private static final int DIGIT_LENGTH = 3;
    private static final String ZERO = "0";
    private static final String NUMBER_PATTERN = "\\d+";

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
        if (!input.equals(String.valueOf(GameRule.RESTART_NUMBER.getRule())) && !input.equals(String.valueOf(GameRule.END_NUMBER.getRule()))) {
            throw new IllegalArgumentException();
        }
    }
}
