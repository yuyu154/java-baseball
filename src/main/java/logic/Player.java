package logic;

import domain.GameNumber;
import domain.GameResult;
import util.InputView;
import util.RandomNumberMaker;

public class Player {

    private static final int GAME_COUNT = 3;
    private GameNumber playerGameNumber;
    private GameNumber randomGameNumber;

    public Player() {
        init();
    }

    private void init() {
        randomGameNumber = RandomNumberMaker.getRandomGameNumber(GAME_COUNT);
    }

    public void play() {
        do {
            gameProceed();
        } while(askRestart());
    }

    private void gameProceed() {
        GameResult result ;
        do {
            playerGameNumber = InputView.getGameNumber();
            result = randomGameNumber.calculate(playerGameNumber);
            result.printResult();
        } while (!result.isFinsh());
    }

    private boolean askRestart() {
        init();
        return InputView.getRestartToken().isRestart();
    }
}
