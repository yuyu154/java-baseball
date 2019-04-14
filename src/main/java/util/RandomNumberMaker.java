package util;

import domain.GameNumber;
import domain.RandomGameNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberMaker {
    private static final String BLANK = "";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    public static GameNumber getRandomGameNumber(int count) {
        try {
            return new RandomGameNumber(getGameNumberString(count));
        } catch (IllegalArgumentException e) {
            return getRandomGameNumber(count);
        }
    }

    private  static String getGameNumberString(int count) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
            list.add(Integer.toString(getRandomNumber()));
        }
        return String.join(BLANK, list);
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return (random.nextInt(MAX_NUMBER) + MIN_NUMBER);
    }
}
