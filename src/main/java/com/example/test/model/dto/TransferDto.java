package com.example.test.model.dto;

import java.util.Objects;

public class TransferDto {
    private String playerName;
    private String fromClub;
    private String toClub;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getFromClub() {
        return fromClub;
    }

    public void setFromClub(String fromClub) {
        this.fromClub = fromClub;
    }

    public String getToClub() {
        return toClub;
    }

    public void setToClub(String toClub) {
        this.toClub = toClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferDto that = (TransferDto) o;
        return Objects.equals(playerName, that.playerName) && Objects.equals(fromClub, that.fromClub) && Objects.equals(toClub, that.toClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, fromClub, toClub);
    }

    @Override
    public String toString() {
        return "TransferDto{" +
                "playerName='" + playerName + '\'' +
                ", fromClub='" + fromClub + '\'' +
                ", toClub='" + toClub + '\'' +
                '}';
    }
}
