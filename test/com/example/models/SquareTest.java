package com.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculateArea() {
        Square square = new Square(10);
        assertEquals(100, square.area());
    }

    @Test
    void calculateZeroArea() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void calculatePerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.perimeter());
    }

    @Test
    void calculateZeroPerimeter() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}