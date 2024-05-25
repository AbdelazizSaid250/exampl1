package com.example.test.utilities;

public enum ShapeEnum {
    RECTANGLE,
    SQUARE,
    TRIANGLE,
    CIRCLE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public static ShapeEnum fromString(String shape) {
        return ShapeEnum.valueOf(shape.toUpperCase());
    }
}
