package com.math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void favorable() {
        Probability probability = Probability.fromValues(1, 2);
        assertEquals(0.5, probability.favorProbability());
    }

    @Test
    void nonFavorable() {
        Probability probability = Probability.fromValues(1, 2);
        assertEquals(0.5, probability.nonFavorProbability());
    }

    @Test
    void invalidValues() {
        InvalidValuesException exception = assertThrows(InvalidValuesException.class, () -> {
            Probability.fromValues(8, 1);
        });

        assertEquals("Values are invalid", exception.getMessage());
    }
}