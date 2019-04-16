package domain;

import java.util.Arrays;
import java.util.List;

public class GameNumber {
    private static final String BLANK = "\\s*";
    private static final String ZERO = "0";
    private static final int SIZE = 3;
    private static final String COMMA = ",";

    protected List<String> numbers;

    public GameNumber(String input) {
        checkLenth(input);
        checkIfContainZero(input);
        numbers = Arrays.asList(input.split(BLANK));
    }

    private void checkLenth(String input) {
        if (input.length() != SIZE) {
            throw new IllegalArgumentException("세자리 외에는 안되요");
        }
    }

    private void checkIfContainZero(String input) {
        if (input.contains(ZERO)) {
            throw new IllegalArgumentException("0를 입력하지마세요");
        }
    }

    public GameResult calculate(GameNumber answerNumber) {
        int strike = 0;
        int ball = 0;
        for (int index = 0; index < numbers.size(); index++) {
            String number = numbers.get(index);
            strike += answerNumber.getStrike(number, index);
            ball += answerNumber.getBall(number, index);
        }
        return new GameResult(ball, strike);
    }

    private int getStrike(String number, int index) {
        if (this.isStrike(number, index)) {
            return 1;
        }
        return 0;
    }

    protected boolean isStrike(String number, int index) {
        return this.numbers.get(index).equals(number);
    }

    protected int getBall(String number, int index) {
        if (this.isBall(number) && !isStrike(number, index)) {
            return 1;
        }
        return 0;
    }

    protected boolean isBall(String number) {
        return this.numbers.contains(number);
    }

    public String toString() {
        return String.join(COMMA, numbers);
    }
}
