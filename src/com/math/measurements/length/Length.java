package com.math.measurements.length;

import java.util.Objects;

public class Length {
    private final double value;
    private final double factor;

    private Length(double value, double factor) {
        this.value = value;
        this.factor = factor;
    }

    public static Length inCentimeter(double value) {
        return new Length(value, 2);
    }

    public static Length inFeet(double value) {
        return new Length(value, 60);
    }


    public static Length inInch(double value) {
        return new Length(value, 5);
    }


    public static Length inMillimeter(double value) {
        return new Length(value, 0.2);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return (value * factor) == (length.value * length.factor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, factor);
    }
}
