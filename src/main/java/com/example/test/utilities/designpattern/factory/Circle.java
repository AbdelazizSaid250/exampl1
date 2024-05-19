package com.example.test.utilities.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

    @Override
    public void draw() {
        log.warn("drawing Circle");
        // drawing Circle

        log.info("Finished drawing Circle");
    }
}
