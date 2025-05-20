package com.math.measurements.length;

public enum Unit {
    CENTIMETER(2),
    MILLIMETER(0.2),
    FEET(60),
    INCH(5);

    private final double factor;

    Unit(double factor) {
        this.factor = factor;
    }

    public double getBaseValue(double value) {
        return value * factor;
    }
}
