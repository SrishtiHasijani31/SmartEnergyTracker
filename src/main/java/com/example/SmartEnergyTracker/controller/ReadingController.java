package com.example.SmartEnergyTracker.controller;

import com.example.SmartEnergyTracker.model.MeterReadingRequest;
import com.example.SmartEnergyTracker.model.MeterReadingResponse;
import com.example.SmartEnergyTracker.service.ReadingsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
@RequestMapping("/api/v1")
public class ReadingController {

    private final ReadingsService readingsService;

    public ReadingController(ReadingsService readingsService) {
        this.readingsService = readingsService;
    }

    @PostMapping("/readings")
    public MeterReadingResponse addMeterReading(@RequestBody
                                              MeterReadingRequest request) {
        return readingsService.addMeterReading(request);
    }
}
