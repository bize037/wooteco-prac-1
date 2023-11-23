package baseball.domain;

import java.util.Arrays;
import java.util.function.BiPredicate;

public enum ScoreBoard {
    BALL_STRIKE((ball, strike) -> ball > 0 && strike > 0),
    BALL((ball, strike) -> ball > 0 && strike == 0),
    STRIKE((ball, strike) -> ball == 0 && strike > 0);

    private static final String BALL_STRIKE_MESSAGE = "%d볼 %d스트라이크";
    private static final String BALL_MESSAGE = "%d볼";
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String NOTHING_STRING = "";

    private final BiPredicate<Integer, Integer> judge;

    ScoreBoard(BiPredicate<Integer, Integer> judge) {
        this.judge = judge;
    }

    public static String getScore(int ball, int strike) {
        return Arrays.stream(values())
                .filter(score -> score.judge.test(ball, strike))
                .findFirst()
                .map(score -> score.getResult(ball, strike))
                .orElse(NOTHING_MESSAGE);
    }

    private String getResult(int ball, int strike) {
        if (this == BALL_STRIKE) {
            return String.format(BALL_STRIKE_MESSAGE, ball, strike);
        }
        if (this == BALL) {
            return String.format(BALL_MESSAGE, ball);
        }
        if (this == STRIKE) {
            return String.format(STRIKE_MESSAGE, strike);
        }
        return NOTHING_STRING;
    }
}
