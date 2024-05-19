package com.example.test.utilities.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {

    @Override
    public void draw() {
        log.warn("drawing Square");
        // drawing Square

        log.info("Finished drawing Square");
    }
}
