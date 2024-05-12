package com.example.test.controller;

import com.example.test.model.dto.CreateMatchDto;
import com.example.test.model.dto.TransferDto;
import com.example.test.utilities.FifaWorldCup;
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

    @PostMapping("sing/{songName}/{danceName}")
    public void greetWithSong(@PathVariable String songName, @PathVariable String danceName) {
        funUtility.sing(songName);
        funUtility.dance(danceName);
    }
}
