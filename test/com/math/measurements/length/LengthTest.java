package com.math.measurements.length;

import com.math.measurements.length.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void feetToInch() {
        Length feet = new Feet(1);
        Length inch = new Inch(12);

        assertEquals(feet, inch);
    }

    @Test
    void inchesToCentimeter() {
        Length cm = new Centimeter(5);
        Length inch = new Inch(2);

        assertEquals(cm, inch);
    }

    @Test
    void centimeterToMillimeter() {
        Length cm = new Centimeter(1);
        Length mm = new Millimeter(10);

        assertEquals(cm, mm);
    }
}