package com.math.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    void value() {
        Fraction fraction = new Fraction(1,1);
        assertEquals(1,fraction.value());
    }
}