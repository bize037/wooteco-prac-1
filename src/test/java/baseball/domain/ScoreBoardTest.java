package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScoreBoardTest {
    @DisplayName("볼-스트라이크 스코어를 정상적으로 리턴하는가")
    @CsvSource(value = {"2, 0, 2볼", "2, 1, 2볼 1스트라이크", "0, 3, 3스트라이크", "0, 0, 낫싱"})
    @ParameterizedTest
<<<<<<< HEAD
    void outputScoreTest(String ball, String strike, String score) {
=======
    void outputPlayerNumberListTest(String ball, String strike, String score) {
>>>>>>> 22c21583502221907f4f43a305eee306eb808bfd
        Assertions.assertThat(ScoreBoard.getScore(Integer.parseInt(ball), Integer.parseInt(strike))).isEqualTo(score);
    }
}
