package com.example.test.utilities.designpattern.factory;

import com.example.test.utilities.DefinedValues;
import org.springframework.stereotype.Service;

@Service
public class ShapeFactory implements ShapeService {

    // Take type and returns Class that implements Shape
    public Shape getShape(String type) {
        switch (type.toLowerCase()) {
            case DefinedValues.RECTANGLE:
                return new Rectangle();
            case DefinedValues.SQUARE:
                return new Square();
            case DefinedValues.TRIANGLE:
                return new Triangle();
            case DefinedValues.CIRCLE:
                return new Circle();
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + type);
        }
    }

}
