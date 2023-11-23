package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Referee {
    private static final int FIRST_INDEX = 0;
    private long ball;
    private long strike;

    public Referee(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        this.ball = countBall(computerNumbers, playerNumbers);
        this.strike = countStrike(computerNumbers, playerNumbers);;
    }

    public int getBall() {
        return (int) ball;
    }

    public int getStrike() {
        return (int) strike;
    }

    private long countStrike(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return IntStream.range(FIRST_INDEX, computerNumbers.size())
                .filter(i -> playerNumbers.contains(computerNumbers.get(i)) && i == playerNumbers.indexOf(computerNumbers.get(i)))
                .count();
    }

    private long countBall(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return IntStream.range(FIRST_INDEX, computerNumbers.size())
                .filter(i -> playerNumbers.contains(computerNumbers.get(i)) && i != playerNumbers.indexOf(computerNumbers.get(i)))
                .count();
    }
}
