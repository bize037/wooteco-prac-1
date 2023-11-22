package baseball.domain;

import baseball.common.util.Utils;
import baseball.common.validate.Validate;
import java.util.List;

public class Player {
    private List<Integer> playerNumber;

    public Player(String inputPlayerNumber) {
        this.playerNumber = outputPlayerNumberList(inputPlayerNumber);
    }

    public List<Integer> getPlayerNumber() {
        return playerNumber;
    }

    private List<Integer> outputPlayerNumberList(String inputPlayerNumber) {
        validatePlayerNumber(inputPlayerNumber);
        return Utils.putInList(inputPlayerNumber);
    }

    private void validatePlayerNumber(String inputPlayerNumber) {
        Validate.isBlank(inputPlayerNumber);
        Validate.inText(inputPlayerNumber);
        Validate.inZero(inputPlayerNumber);
        Validate.notThreeDigit(inputPlayerNumber);
    }
}
