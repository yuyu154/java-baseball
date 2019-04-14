package domain;

import java.util.Arrays;
import java.util.List;

public class GameNumber {
    private List<String> numbers;

    public GameNumber(String input) {
        checkLenth(input);
        checkIsZero(input);
        numbers = Arrays.asList(input.split(""));
        System.out.println(numbers);
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
        int strike = getStrike(other);
        int ball = getBalls(other);
        return new GameResult(ball, strike);
    }

    private int getBalls(GameNumber other) {
        return (int) numbers.stream()
                .filter(number -> other.isBall(number))
                .filter(number -> !other.isStrike(number, numbers.indexOf(number)))
                .count();
    }

    private int getStrike(GameNumber other) {
        return (int) numbers.stream()
                .filter(number -> other.isStrike(number, numbers.indexOf(number)))
                .count();
    }

    private boolean isStrike(String number, int index) {
        return numbers.get(index).equals(number);
    }

    private boolean isBall(String number) {
        return numbers.contains(number);
    }

    public String toString() {
        return String.join("", numbers);
    }

}
