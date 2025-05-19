package com.math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void favorable() {
        Probability probability = Probability.fromValue(0.5);
        assert(probability.equals(Probability.fromValue(0.5)));
    }

    @Test
    void nonFavorable() {
        Probability probability = Probability.fromValue(0.5);
        Probability nonFav = probability.not();
        assert(nonFav.equals(Probability.fromValue(0.5)));
    }

    @Test
    void invalidValues() {
        InvalidValuesException exception = assertThrows(InvalidValuesException.class, () -> {
            Probability.fromValue(1.1);
        });

        assertEquals("Values are invalid", exception.getMessage());
    }

    @Test
    void twoCoinsWithTails() {
        Probability probability = Probability.fromValue(0.25);
        assert(probability.equals(Probability.fromValue(0.25)));
    }
}