package baseball.domain;

import baseball.common.constant.GameRule;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Integer> computerNumbers;

    public Computer() {
        this.computerNumbers = notOverlapRandomNumbers(GameRule.NUMBERS_COUNT.getRule(), GameRule.MIN_NUMBER.getRule(), GameRule.MAX_NUMBER.getRule());
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    private List<Integer> notOverlapRandomNumbers(int numbersCount, int minNumber, int maxNumber) {
        List<Integer> computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < numbersCount) {
            int randomNumber = Randoms.pickNumberInRange(minNumber, maxNumber);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        return computerNumbers;
    }
}
