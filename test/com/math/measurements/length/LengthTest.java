package com.math.measurements.length;

import com.math.measurements.length.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void feetToInch() {
        Length feet = Length.inFeet(1);
        Length inch = Length.inInch(12);

        assertEquals(feet, inch);
    }

    @Test
    void inchesToCentimeter() {
        Length cm = Length.inCentimeter(5);
        Length inch = Length.inInch(2);

        assertEquals(cm, inch);
    }

    @Test
    void centimeterToMillimeter() {
        Length cm = Length.inCentimeter(1);
        Length mm = Length.inMillimeter(10);

        assertEquals(cm, mm);
    }
}