package baseball.domain;

import java.util.Arrays;
import java.util.function.BiPredicate;

public enum ScoreBoard {
    BALL_AND_STRIKE((ball, strike) -> ball > 0 && strike > 0),
    ONLY_BALL((ball, strike) -> ball > 0 && strike == 0),
    ONLY_STRIKE((ball, strike) -> ball == 0 && strike > 0);

    private static final String BALL_AND_STRIKE_MESSAGE = "%d볼 %d스트라이크";
    private static final String ONLY_BALL_MESSAGE = "%d볼";
    private static final String ONLY_STRIKE_MESSAGE = "%d스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";

    private final BiPredicate<Integer, Integer> judge;

    ScoreBoard(BiPredicate<Integer, Integer> judge) {
        this.judge = judge;
    }

    public static String getScore(int ball, int strike) {
        return Arrays.stream(values())
                .filter(referee -> referee.judge.test(ball, strike))
                .findFirst()
                .map(referee -> referee.getResult(ball, strike))
                .orElse(NOTHING_MESSAGE);
    }

    private String getResult(int ball, int strike) {
        if (this == BALL_AND_STRIKE) {
            return String.format(BALL_AND_STRIKE_MESSAGE, ball, strike);
        }
        if (this == ONLY_BALL) {
            return String.format(ONLY_BALL_MESSAGE, ball);
        }
        if (this == ONLY_STRIKE) {
            return String.format(ONLY_STRIKE_MESSAGE, strike);
        }
        return "";
    }
}
