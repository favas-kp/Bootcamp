package com.math.shape.models;

import com.math.shape.exceptions.NegativeNumberError;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        if (length < 0 || width < 0) throw new NegativeNumberError("Negative numbers not allowed");

        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
