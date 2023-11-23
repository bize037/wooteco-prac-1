package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScoreBoardTest {
    @DisplayName("플레이어의 숫자를 정상적으로 리턴하는가")
    @Test
    void outputPlayerNumberListTest() {
        System.out.println(ScoreBoard.getScore(2, 0));
        System.out.println(ScoreBoard.getScore(2, 1));
        System.out.println(ScoreBoard.getScore(0, 3));
        System.out.println(ScoreBoard.getScore(0, 0));
    }
}
