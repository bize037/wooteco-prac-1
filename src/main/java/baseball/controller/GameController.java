package baseball.controller;

import baseball.common.validate.Validate;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Referee;
import baseball.domain.ScoreBoard;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

public class GameController {
    private Computer computer;
    private Player player;
    private Referee referee;

    public void start() {
        InputView.printStartGameMessage();
        game();
    }

    private void game() {
        int restart = 1;
        while (restart == 1) {
            createComputerNumber();
            repeatsPartsInGame();
            restart = decideRestartGame();
        }
    }

    private void repeatsPartsInGame() {
        createPlayerNumber();
        judgeBallStrike();
        System.out.println(printScore());
        if (!printScore().equals("3스트라이크")) {
            repeatsPartsInGame();
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
