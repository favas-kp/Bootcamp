package com.math.measurements.volume;

public enum Unit {
    LITER(1),
    GALLON(3.78);

    private final double factor;

    Unit(double factor) {
        this.factor = factor;
    }

    public double getUnitValue(double value) {
        return factor * value;
    }
}
