package domain;

public class RestartToken {
    private final int number;

    public RestartToken(int number) {
        isValid(number);
        this.number = number;
    }

    private void isValid(int number) {
        if (!(number == 1 || number == 2)) {
            throw new IllegalArgumentException("1또는 2를 눌르세요\n");
        }
    }

    public boolean isRestart() {
        if (number == 1) {
            return true;
        }
        return false;
    }
}
