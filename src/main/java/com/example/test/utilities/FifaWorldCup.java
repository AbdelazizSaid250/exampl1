package com.example.test.utilities;

import org.springframework.stereotype.Component;

@Component
public class FifaWorldCup {

    public void transfer(String playerName, String fromClub, String toClub) {
        System.out.println(playerName + " is transferred from " + fromClub + " to " + toClub + "!!");
    }

    public void createMatch(String firstClub, String secondClub) {
        System.out.println(firstClub + " vs " + secondClub);
    }
}
