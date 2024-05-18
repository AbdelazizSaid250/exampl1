package com.example.test.config;

import com.example.test.utilities.FunUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FunController {

    // Constructor Injection
    private final FunUtility funUtility;

    @Autowired
    public FunController(FunUtility funUtility) {
        this.funUtility = funUtility;
    }

//    private FunUtility funUtility;

    @PostMapping("sing/{songName}/{danceName}")
    public void greetWithSong(@PathVariable String songName, @PathVariable String danceName) {
        funUtility.sing(songName);
        funUtility.dance(danceName);
    }

    /*@Autowired(required = false)
    public void setFunUtility(FunUtility funUtility) {
        this.funUtility = funUtility;
    }*/
}
