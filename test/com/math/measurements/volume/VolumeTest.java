package com.math.measurements.volume;

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
}