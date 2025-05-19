package com.math.probability;

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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Probability)) return false;

        return value == ((Probability) obj).value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
