package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScoreBoardTest {
    @DisplayName("볼-스트라이크 스코어를 정상적으로 리턴하는가")
    @CsvSource(value = {"2, 0, 2볼", "2, 1, 2볼 1스트라이크", "0, 3, 3스트라이크", "0, 0, 낫싱"})
    @ParameterizedTest
    void outputScoreTest(String ball, String strike, String score) {
        Assertions.assertThat(ScoreBoard.getScore(Integer.parseInt(ball), Integer.parseInt(strike))).isEqualTo(score);
    }
}
