package util;

import domain.GameNumber;
import domain.RandomGameNumber;
import org.junit.Before;
import org.junit.Test;

public class BaseBallTest {

    GameNumber randomGameNumber;

    @Before
    public void make() {
        randomGameNumber = new RandomGameNumber("524");
    }

    @Test
    public void test() {
        new GameNumber("222").calculate(randomGameNumber).printResult();
        new GameNumber("167").calculate(randomGameNumber).printResult();
        new GameNumber("524").calculate(randomGameNumber).printResult();
        new GameNumber("514").calculate(randomGameNumber).printResult();
        new GameNumber("452").calculate(randomGameNumber).printResult();
        new GameNumber("542").calculate(randomGameNumber).printResult();
    }
}