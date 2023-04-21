package com.example.apiparcking.entities;

import java.time.LocalDateTime;

public class Car {
    private String licensePLate;
    private String color;
    private LocalDateTime entryTime;

    public Car(String licensePLate, String color) {
        this.licensePLate = licensePLate;
        this.color = color;
    }

    public String getLicensePLate() {
        return licensePLate;
    }

    public void setLicensePLate(String licensePLate) {
        this.licensePLate = licensePLate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
