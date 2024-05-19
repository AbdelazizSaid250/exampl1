package com.example.test.utilities.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements Shape {

    @Override
    public void draw() {
        log.error("drawing Triangle");
        // drawing Triangle

        log.info("Finished drawing Triangle");
    }
}
