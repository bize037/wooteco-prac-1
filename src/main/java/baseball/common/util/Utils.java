package baseball.common.util;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static final int START_INDEX = 0;
    private static final int NEXT_INDEX = 1;

    public static List<Integer> putInList(String inputPlayerNumber) {
        List<Integer> playerNumber = new ArrayList<>();
        for (int i = START_INDEX; i < inputPlayerNumber.length(); i++) {
            playerNumber.add(Integer.parseInt(inputPlayerNumber.substring(i, i + NEXT_INDEX)));
        }
        return playerNumber;
    }
}
