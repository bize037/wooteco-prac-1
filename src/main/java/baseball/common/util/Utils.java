package baseball.common.util;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Integer> putInList(String inputPlayerNumber) {
        List<Integer> playerNumber = new ArrayList<>();
        for (int i = 0; i < inputPlayerNumber.length(); i++) {
            playerNumber.add(Integer.parseInt(inputPlayerNumber.substring(i, i + 1)));
        }
        return playerNumber;
    }
}
