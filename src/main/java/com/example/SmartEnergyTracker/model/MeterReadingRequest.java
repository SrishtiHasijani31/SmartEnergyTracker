package com.example.SmartEnergyTracker.model;


import lombok.*;



public class MeterReadingRequest {

    private String smartMeterId;
    private Readings readings;

    public String getSmartMeterId() {
        return smartMeterId;
    }

    public void setSmartMeterId(String smartMeterId) {
        this.smartMeterId = smartMeterId;
    }

    public Readings getReadings() {
        return readings;
    }

    public void setReadings(Readings readings) {
        this.readings = readings;
    }

    public MeterReadingRequest(String smartMeterId, Readings readings) {
        this.smartMeterId = smartMeterId;
        this.readings = readings;
    }
    public MeterReadingRequest() {
    }

    @Override
    public String toString() {
        return "MeterReadingRequest{" +
                "smartMeterId='" + smartMeterId + '\'' +
                ", readings=" + readings +
                '}';
    }
}
