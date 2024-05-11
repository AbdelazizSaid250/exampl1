package com.example.test.model.dto;

import java.util.Objects;

public class AddressDto {

    private String country;

    private String governance;

    private String city;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGovernance() {
        return governance;
    }

    public void setGovernance(String governance) {
        this.governance = governance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto that = (AddressDto) o;
        return Objects.equals(country, that.country) && Objects.equals(governance, that.governance) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, governance, city);
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "country='" + country + '\'' +
                ", governance='" + governance + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
