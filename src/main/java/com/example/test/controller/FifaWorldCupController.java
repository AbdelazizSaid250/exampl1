package com.example.test.controller;

import com.example.test.model.dto.CreateMatchDto;
import com.example.test.model.dto.TransferDto;
import com.example.test.utilities.FifaWorldCup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fifa")
public class FifaWorldCupController {

    // Field Injection
//    @Autowired
    private FifaWorldCup fifaWorldCup;

    @PostMapping("transfer")
    public void transferApi(@RequestBody TransferDto transferDto) {
        System.out.println("I am in transferApi()");
        if (fifaWorldCup == null) {
            System.out.println("fifaWorldCup bean is null, Initializing FifaWorldCup normally");
            fifaWorldCup = new FifaWorldCup();
            fifaWorldCup.transfer(transferDto.getPlayerName(), transferDto.getFromClub(), transferDto.getToClub());
        } else {
            System.out.println("fifaWorldCup bean created by Spring");
            fifaWorldCup.transfer(transferDto.getPlayerName(), transferDto.getFromClub(), transferDto.getToClub());
        }
    }

    @DeleteMapping("createMatch")
    public void createMatchApi(@RequestBody CreateMatchDto createMatchDto) {
        System.out.println("I am in createMatchApi()");
        fifaWorldCup.createMatch(createMatchDto.getFirstClub(), createMatchDto.getSecondClub());
    }

    // Setter Injection
    @Autowired(required = false)
    public void setFifaWorldCup(FifaWorldCup fifaWorldCup) {
        this.fifaWorldCup = fifaWorldCup;
    }
}
