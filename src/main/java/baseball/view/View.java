package baseball.view;

public class View {
    private static final String startGameMessage = "숫자 야구 게임을 시작합니다.";
    private static final String numberMessage = "숫자를 입력해주세요 : ";
    private static final String successMessage = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String restartMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public static void printStartGameMessage() {
        System.out.println(startGameMessage);
    }

    public static void inputNumberMessage() {
        System.out.print(numberMessage);
    }

    public static void printSuccessMessage() {
        System.out.println(successMessage);
    }

    public static void inputRestartMessage() {
        System.out.println(restartMessage);
    }
}
