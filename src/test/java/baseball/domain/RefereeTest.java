package baseball.domain;

import baseball.common.util.Utils;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RefereeTest {
    @DisplayName("볼과 스트라이크를 계산하여 정상적으로 출력하는가")
    @CsvSource(value = {"143,345,1,1", "456,256,0,2", "814,814,0,3"})
    @ParameterizedTest
    void ballStrikeTest(String computerNumber, String playerNumber, String ball, String strike) {
        Referee referee = new Referee(Utils.putInList(computerNumber), Utils.putInList(playerNumber));
        assertThat(referee.getBall()).isEqualTo(Integer.parseInt(ball));
        assertThat(referee.getStrike()).isEqualTo(Integer.parseInt(strike));
    }
}
