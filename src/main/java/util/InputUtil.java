package util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getGameNumberString() {
        String input = SCANNER.nextLine();
        try {
            Integer.parseInt(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 입력하세요");
            return getGameNumberString();
        }
    }
}
