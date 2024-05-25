package com.example.test.utilities.designpattern.factory;

import com.example.test.error.exception.UnsupportedShapeException;
import com.example.test.utilities.ShapeEnum;
import org.springframework.stereotype.Service;

@Service
public class ShapeFactory implements ShapeService {

    // Take type and returns Class that implements Shape
    public Shape getShape(String type) {
        switch (ShapeEnum.fromString(type)) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new UnsupportedShapeException("Unsupported shape type: " + type);
        }
    }

}
