package domain;

public class GameResult {
    private final int FINSH_COUNT = 3;
    private final int balls;
    private final int strike;

    public GameResult(int balls, int strike) {
        this.balls = balls;
        this.strike = strike;
    }

    public void printResult() {
        if (strike == 0 && balls == 0) {
            System.out.println("낫싱");
            return;
        }
        System.out.printf("Ball 수 : %d, Strike 수: %d\n", balls, strike);
    }

    public boolean isFinsh() {
        if (strike == FINSH_COUNT) {
            return true;
        }
        return false;
    }
}
