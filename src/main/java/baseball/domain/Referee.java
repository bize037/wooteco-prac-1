package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Referee {
    private long ball;
    private long strike;

    public Referee(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        this.ball = countBall(computerNumbers, playerNumbers);
        this.strike = countStrike(computerNumbers, playerNumbers);;
    }

    public long getBall() {
        return ball;
    }

    public long getStrike() {
        return strike;
    }

    private long countStrike(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return IntStream.range(0, computerNumbers.size())
                .filter(i -> playerNumbers.contains(computerNumbers.get(i)) && i == playerNumbers.indexOf(computerNumbers.get(i)))
                .count();
    }

    private long countBall(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        return IntStream.range(0, computerNumbers.size())
                .filter(i -> playerNumbers.contains(computerNumbers.get(i)) && i != playerNumbers.indexOf(computerNumbers.get(i)))
                .count();
    }
}
