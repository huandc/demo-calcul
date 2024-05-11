package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculate {
    public List<Integer> squareOfEvens(List<Integer> numbers) {
        if (Objects.isNull(numbers) || numbers.isEmpty()) {
            throw new IllegalArgumentException("numbers should not be null or empty");
        }
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number * number);
            }
        }
        return result;
    }
}
