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

    @Test
    void addsTwoInches() {
        Length inch1 = Length.inInch(2);
        Length inch2 = Length.inInch(2);
        Length sum = inch1.add(inch2);

        assertEquals(Length.inInch(4), sum);
    }

    @Test
    void addsTwoMillimeters() {
        Length mm1 = Length.inMillimeter(2);
        Length mm2 = Length.inMillimeter(3);
        Length sum = mm1.add(mm2);

        assertEquals(Length.inMillimeter(5), sum);
    }

    @Test
    void errorWhenTwoDifferentUnitsAdded() {
        Length cm = Length.inCentimeter(2);
        Length mm = Length.inMillimeter(3);

        assertThrows(InvalidUnitException.class, () -> {
            cm.add(mm);
        });
    }
}