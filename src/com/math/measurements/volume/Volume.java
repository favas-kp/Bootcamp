package com.math.measurements.volume;

import com.math.measurements.length.Length;

import java.util.Objects;

public class Volume {
    private final double value;
    private final double factor;

    private Volume(double value, double factor) {
        this.value = value;
        this.factor = factor;
    }

    public static Volume inGallon(double value) {
        return new Volume(value, 3.78);
    }

    public static Volume inLiter(double value) {
        return new Volume(value, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return (value * factor) == (volume.value * volume.factor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, factor);
    }
}
