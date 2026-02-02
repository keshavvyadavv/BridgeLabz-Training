package com.streamapi;

import java.util.*;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> sensorReadings = List.of(
            22.5,
            30.2,
            18.9,
            35.6,
            28.4,
            40.1
        );

        double threshold = 30.0;

        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                          System.out.println("Alert! High Reading: " + reading)
                      );
    }
}
