package com.example.SmartEnergyTracker.model;

import lombok.*;


public class MeterReadingResponse {

    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MeterReadingResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public MeterReadingResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
    public MeterReadingResponse(){}

    private String message;
}
