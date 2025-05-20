package com.math.length;

import java.util.Objects;

public abstract class Length {
    double value;
    double factor;

    public Length(double value, double factor) {
        this.value = value;
        this.factor = factor;
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
