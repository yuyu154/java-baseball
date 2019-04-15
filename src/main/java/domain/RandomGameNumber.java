package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomGameNumber extends GameNumber {

    public RandomGameNumber(String input) {
        super(input);
        checkDuplicate(numbers);
    }

    private void checkDuplicate(List<String> input) {
        Set<String> checkSet = new HashSet<>(input);
        if (checkSet.size() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
