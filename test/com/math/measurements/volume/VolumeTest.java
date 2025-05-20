package com.math.measurements.volume;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void equalGallonAndLiters() {
        Volume gallons = Volume.inGallon(1);
        Volume liters = Volume.inLiter(3.78);

        assertEquals(gallons, liters);
    }

    @Test
    void unEqualGallonAndLiters() {
        Volume gallons = Volume.inGallon(3);
        Volume liters = Volume.inLiter(7.56);

        assertNotEquals(gallons, liters);
    }

    @Test
    void addsGallonAndLiterToLiter() {
        Volume gallon = Volume.inGallon(1);
        Volume liter = Volume.inLiter(1);
        Volume sumInLiter = gallon.add(liter);

        assertEquals(Volume.inLiter(4.78), sumInLiter);
    }
}