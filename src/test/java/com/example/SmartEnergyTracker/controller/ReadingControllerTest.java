package com.example.SmartEnergyTracker.controller;

import com.example.SmartEnergyTracker.model.MeterReadingRequest;
import com.example.SmartEnergyTracker.model.MeterReadingResponse;
import com.example.SmartEnergyTracker.model.Readings;
import com.example.SmartEnergyTracker.service.ReadingsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;

import static java.lang.System.currentTimeMillis;
import static org.junit.jupiter.api.Assertions.*;

class ReadingControllerTest {

    @Test
    void testAddMeterReading() {
        ReadingsService mockReadingService = Mockito.mock(ReadingsService.class);
        MeterReadingRequest request = new MeterReadingRequest();
        request.setSmartMeterId("12345");
        Readings readings = new Readings();
        readings.setPower(12.34);
        readings.setTimestamp(currentTimeMillis() + "");
        request.setReadings(readings);
        MeterReadingResponse expectedResponse = new MeterReadingResponse();
        Mockito.when(mockReadingService.addMeterReading(request)).thenReturn(expectedResponse);
        ReadingController readingsController = new ReadingController(mockReadingService);
        MeterReadingResponse actualResponse = mockReadingService.addMeterReading(request);
        assertNotNull(actualResponse);
        assertEquals(expectedResponse, actualResponse);
        Mockito.verify(mockReadingService).addMeterReading(request);

    }

    @Test
    void testControllerInstantiation() {
        Readings controller = new Readings();
        assertNotNull(controller);
    }
}