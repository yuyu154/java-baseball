package util;

import domain.GameNumber;
import domain.RestartToken;

public class InputView {

    public static GameNumber getGameNumber() {
        try {
            System.out.println("3자리의 number를 입력하세요");
            return new GameNumber(InputUtil.getGameNumberString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameNumber();
        }
    }

    public static RestartToken getRestartToken() {
        try {
            System.out.println("재실행하려면 1을 아니면 2를 입력하세요");
            return new RestartToken(getInt());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getRestartToken();
        }
    }

    private static int getInt() {
        return Integer.parseInt(InputUtil.getGameNumberString());
    }
}
