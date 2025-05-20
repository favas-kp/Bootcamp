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
    void addsTwoInchesAndGetInInches() {
        Length inch1 = Length.inInch(2);
        Length inch2 = Length.inInch(2);
        Length sumInInch = inch1.add(inch2);

        assertEquals(Length.inInch(4), sumInInch);
    }

    @Test
    void addInchAndCentimeterAndGetInInches() {
        Length inches = Length.inInch(2);
        Length cm = Length.inCentimeter(2.5);
        Length sumInInch = inches.add(cm);

        assertEquals(Length.inInch(3), sumInInch);
    }
}