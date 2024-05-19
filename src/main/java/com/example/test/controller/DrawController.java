package com.example.test.controller;

import com.example.test.utilities.designpattern.factory.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("draw")
public class DrawController {

    private final ShapeService shapeFactory;

    @Autowired
    public DrawController(ShapeService shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    @GetMapping("{shape}")
    void draw(@PathVariable String shape) {
        shapeFactory.getShape(shape).draw();
    }
}
