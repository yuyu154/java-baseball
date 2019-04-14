package util;

import domain.GameNumber;
import domain.RestartToken;

public class InputView {

    public static GameNumber getGameNumber() {
        try {
            System.out.println("세자리 숫자 입력하세요");
            return new GameNumber(InputUtil.getGameNumberString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameNumber();
        }
    }

    public static RestartToken getRestartToken() {
        try {
            System.out.println("재시작 1 누르시고 아니면 2누르시고");
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
