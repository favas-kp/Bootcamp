package com.math.probability;

import java.util.Objects;

public class Probability {
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability fromValue(double value) {
        if (value > 1 || value < 0) throw new InvalidValuesException("Values are invalid");

        return new Probability(value);
    }

    public Probability not() {
        return new Probability(1 - value);
    }

    public Probability and(Probability probability){
        return  new Probability(value * probability.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Probability)) return false;

        return value == ((Probability) obj).value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Probability or(Probability probability) {
        return new Probability((value + probability.value ) - (value * probability.value));
    }
}
