package util;

import domain.GameNumber;

public class InputView {

    public static GameNumber getGameNumber() {
        try {
            System.out.println("세자리 숫자 입력");
            return new GameNumber(InputUtil.getGameNumberString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameNumber();
        }
    }
}
