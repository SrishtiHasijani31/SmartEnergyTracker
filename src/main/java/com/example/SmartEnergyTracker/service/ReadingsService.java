package com.example.SmartEnergyTracker.service;

import com.example.SmartEnergyTracker.model.MeterReadingRequest;
import com.example.SmartEnergyTracker.model.MeterReadingResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ReadingsService {

    public MeterReadingResponse addMeterReading(MeterReadingRequest request){
        MeterReadingResponse response=new MeterReadingResponse();
        response.setStatus("success");
        response.setMessage("Meter reading added successfully for smart meter ID: " + request.getSmartMeterId());
        return  response;
    }

}
