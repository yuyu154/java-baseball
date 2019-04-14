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
        if(input.contains("0")) {
            throw new IllegalArgumentException("0를 입력하지마세요");
        }
    }

    public String getGameNumbers() {
        return String.join("", numbers);
    }
    public String toString() {
        return String.join("", numbers);
    }

}
