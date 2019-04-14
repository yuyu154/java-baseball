package logic;

import domain.GameNumber;
import util.InputView;

public class Player {

    private GameNumber playerGameNumber;

    public Player() {
        init();
    }
    private void init() {
        playerGameNumber = InputView.getGameNumber();
    }

    public void play() {
        System.out.println(playerGameNumber.getGameNumbers());
    }
}
