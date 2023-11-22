package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import baseball.common.util.Utils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PlayerTest {
    @DisplayName("플레이어의 숫자를 정상적으로 리턴하는가")
    @ValueSource(strings = {"123", "456", "789"})
    @ParameterizedTest
    void outputPlayerNumberListTest(String inputPlayerNumber) {
        Player player = new Player(inputPlayerNumber);
        assertThat(player.getPlayerNumber()).isEqualTo(Utils.putInList(inputPlayerNumber));
    }

    @DisplayName("공백이 들어오면 예외 처리하는가")
    @ValueSource(strings = {""})
    @ParameterizedTest
    void isBlankPlayerNumberTest(String inputPlayerNumber) {
        assertThatThrownBy(() -> new Player(inputPlayerNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("0이 포함되어 있으면 예외 처리하는가")
    @ValueSource(strings = {"102", "730", "094"})
    @ParameterizedTest
    void inZeroPlayerNumberTest(String inputPlayerNumber) {
        assertThatThrownBy(() -> new Player(inputPlayerNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
