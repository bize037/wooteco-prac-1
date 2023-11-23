package baseball.controller;

import baseball.common.constant.GameRule;
import baseball.common.validate.Validate;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Referee;
import baseball.domain.ScoreBoard;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

public class GameController {
    private static final String GAME_OVER_MESSAGE = "3스트라이크";
    private Computer computer;
    private Player player;
    private Referee referee;

    public void start() {
        InputView.printStartGameMessage();
        game();
    }

    private void game() {
        int restart = GameRule.RESTART_NUMBER.getRule();
        while (restart == GameRule.RESTART_NUMBER.getRule()) {
            createComputerNumber();
            repeatsPartsInGame();
            InputView.printSuccessMessage();
            InputView.inputRestartMessage();
            restart = decideRestartGame();
        }
    }

    private void repeatsPartsInGame() {
        while(true) {
            createPlayerNumber();
            judgeBallStrike();
            System.out.println(printScore());
            if (printScore().equals(GAME_OVER_MESSAGE)) {
                break;
            }
        }
    }

    private void createComputerNumber() {
        computer = new Computer();
    }

    private void createPlayerNumber() {
        InputView.inputNumberMessage();
        player = new Player(Console.readLine());
    }

    private void judgeBallStrike() {
        referee = new Referee(computer.getComputerNumbers(), player.getPlayerNumber());
    }

    private String printScore() {
        return ScoreBoard.getScore(referee.getBall(), referee.getStrike());
    }

    private int decideRestartGame() {
        String restartNumber = Console.readLine();
        validateRestartNumber(restartNumber);
        return Integer.parseInt(restartNumber);
    }

    private void validateRestartNumber(String restartNumber) {
        Validate.isBlank(restartNumber);
        Validate.inText(restartNumber);
        Validate.notOneOrTwo(restartNumber);
    }
}
