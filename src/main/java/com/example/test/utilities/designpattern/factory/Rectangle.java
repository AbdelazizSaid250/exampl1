package com.example.test.utilities.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {

    @Override
    public void draw() {
        log.error("drawing Rectangle");
        // drawing Rectangle

        log.info("Finished drawing Rectangle");
    }
}
