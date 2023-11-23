package baseball.common.constant;

public enum GameRule {
    NUMBERS_COUNT(3),
    MIN_NUMBER(1),
    MAX_NUMBER(9);

    private final int rule;

    GameRule(int rule) {
        this.rule = rule;
    }

    public int getRule() {
        return rule;
    }
}
