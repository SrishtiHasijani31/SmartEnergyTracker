package com.example.SmartEnergyTracker.model;

import lombok.*;


public class Readings {
    private String timestamp;
    private Double power;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Readings(String timestamp, Double power) {
        this.timestamp = timestamp;
        this.power = power;
    }
    public Readings() {
    }
}
