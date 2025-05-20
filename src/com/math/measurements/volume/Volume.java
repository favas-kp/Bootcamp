package com.math.measurements.volume;

import java.util.Objects;

public class Volume {
    private final double value;
    private final Unit unit;

    private Volume(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume inGallon(double value) {
        return new Volume(value, Unit.GALLON);
    }

    public static Volume inLiter(double value) {
        return new Volume(value, Unit.LITER);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return unit.getUnitValue(value) == volume.unit.getUnitValue(volume.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
