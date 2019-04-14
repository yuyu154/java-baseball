package logic;

import domain.GameNumber;
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
        playerGameNumber = InputView.getGameNumber();
    }

    public void play() {
    }
}
