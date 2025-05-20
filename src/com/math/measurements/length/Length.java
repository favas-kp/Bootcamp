package com.math.measurements.length;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;

    private Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length inCentimeter(double value) {
        return new Length(value, Unit.CENTIMETER);
    }

    public static Length inFeet(double value) {
        return new Length(value, Unit.FEET);
    }

    public static Length inInch(double value) {
        return new Length(value, Unit.INCH);
    }

    public static Length inMillimeter(double value) {
        return new Length(value, Unit.MILLIMETER);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return unit.getBaseValue(value) == length.unit.getBaseValue(length.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
