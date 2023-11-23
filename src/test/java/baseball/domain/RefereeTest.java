package baseball.domain;

import baseball.common.util.Utils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RefereeTest {
    @CsvSource(value = {"143,345", "456,256", "814,814"})
    @ParameterizedTest
    void ballStrikeTest(String computerNumber, String playerNumber) {
        Referee referee = new Referee(Utils.putInList(computerNumber), Utils.putInList(playerNumber));
        System.out.println("ball : " + referee.getBall());
        System.out.println("strike : " + referee.getStrike());
        System.out.println();
    }
}
