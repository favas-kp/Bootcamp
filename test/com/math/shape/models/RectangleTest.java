package com.math.shape.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(5,4);
        assertEquals(20,rectangle.area());
    }

    @Test
    void areaWithZero() {
        Rectangle rectangle = new Rectangle(0,0);
        assertEquals(0,rectangle.area());
    }

    @Test
    void perimeter() {
        Rectangle shape = new Rectangle(4,5);
        assertEquals(18, shape.perimeter());
    }

    @Test
    void perimeterWithZero() {
        Rectangle shape = new Rectangle(0,0);
        assertEquals(0, shape.perimeter());
    }
}