package com.math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void gettingProbability() {
        Probability probability = Probability.fromValue(0.5);

        assertEquals(probability, Probability.fromValue(0.5));
    }

    @Test
    void gettingComplimentOfProbability() {
        Probability probability = Probability.fromValue(0.5);
        Probability compliment = probability.not();

        assertEquals(compliment, Probability.fromValue(0.5));
    }

    @Test
    void invalidValues() {
        assertThrows(InvalidValuesException.class, () -> {
            Probability.fromValue(1.1);
        });

        assertThrows(InvalidValuesException.class, () -> {
            Probability.fromValue(-0.1);
        });

    }

    @Test
    void gettingTwoProbabilityAtSameTime() {
        Probability probability1 = Probability.fromValue(0.5);
        Probability probability2 = Probability.fromValue(0.5);
        Probability total = probability1.and(probability2);

        assertEquals(total, Probability.fromValue(0.25));
    }

    @Test
    void getAtLeastOneProbability() {
        Probability probability1 = Probability.fromValue(0.5);
        Probability probability2 = Probability.fromValue(0.5);
        Probability atLeastOne = probability1.or(probability2);

        assertEquals(atLeastOne,Probability.fromValue(0.75));
    }
}