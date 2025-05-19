package com.math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void favorable() {
        Probability probability = Probability.fromValue(0.5);

        assertEquals(probability, Probability.fromValue(0.5));
    }

    @Test
    void nonFavorable() {
        Probability probability = Probability.fromValue(0.5);
        Probability nonFav = probability.not();

        assertEquals(nonFav, Probability.fromValue(0.5));
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
        Probability probability1 = Probability.fromValue(0.5);
        Probability probability2 = Probability.fromValue(0.5);
        Probability total = probability1.and(probability2);

        assertEquals(total, Probability.fromValue(0.25));
    }

    @Test
    void atLeastOneTail() {
        Probability probability1 = Probability.fromValue(0.5);
        Probability probability2 = Probability.fromValue(0.5);
        Probability atLeastOne = probability1.or(probability2);

        assertEquals(atLeastOne,Probability.fromValue(0.75));
    }
}