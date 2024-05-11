package org.demo;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {

    @Test
    void should_calculate_success() {
        Calculate calculate = new Calculate();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = calculate.squareOfEvens(numbers);
        assertEquals(List.of(4, 16, 36, 64, 100), result);
    }

    @Test
    void should_throw_exception_when_numbers_is_null() {
        Calculate calculate = new Calculate();
        try {
            calculate.squareOfEvens(null);
        } catch (IllegalArgumentException e) {
            assertEquals("numbers should not be null or empty", e.getMessage());
        }
    }
}