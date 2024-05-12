package com.example.test.model.dto;

import java.util.Objects;

public class CreateMatchDto {
    private String firstClub;
    private String secondClub;

    public String getFirstClub() {
        return firstClub;
    }

    public void setFirstClub(String firstClub) {
        this.firstClub = firstClub;
    }

    public String getSecondClub() {
        return secondClub;
    }

    public void setSecondClub(String secondClub) {
        this.secondClub = secondClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateMatchDto that = (CreateMatchDto) o;
        return Objects.equals(firstClub, that.firstClub) && Objects.equals(secondClub, that.secondClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstClub, secondClub);
    }

    @Override
    public String toString() {
        return "CreateMatchDto{" +
                "firstClub='" + firstClub + '\'' +
                ", secondClub='" + secondClub + '\'' +
                '}';
    }
}
