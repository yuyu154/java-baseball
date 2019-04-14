package domain;

import java.util.Arrays;
import java.util.List;

public class GameNumber {
    private List<String> numbers;

    public GameNumber(String input) {
        checkLenth(input);
        checkIsZero(input);
        numbers = Arrays.asList(input);
    }

    private void checkLenth(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("세자리 숫자 입력하세요 다시");
        }
    }

    private void checkIsZero(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException("0를 입력하지마세요");
        }
    }

    public GameResult calculate(GameNumber other) {
        int strike = 0;
        int ball = 0;
        for (String a : numbers) {
            int index = this.numberAt(a);
            if (other.getNumber(index).equals(a)) {
                strike++;
            } else if (other.isContains(a))
                ball++;
        }
        return new GameResult(ball, strike);
    }

    private String getNumber(int number) {
        return numbers.get(number);
    }

    private int numberAt(String str) {
        return numbers.indexOf(str);
    }

    private boolean isContains(String number) {
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }

    public String getGameNumbers() {
        return String.join("", numbers);
    }

    public String toString() {
        return String.join("", numbers);
    }

}
