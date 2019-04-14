package domain;

public class GameResult {
    private final int balls;
    private final int strike;

    public GameResult(int balls, int strike) {
        this.balls = balls;
        this.strike = strike;
    }

    public void printResult() {
        System.out.printf("Ball 수 : %d, Strike 수: %d", balls, strike);
    }
}
