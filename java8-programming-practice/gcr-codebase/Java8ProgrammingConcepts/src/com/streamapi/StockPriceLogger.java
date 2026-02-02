package com.streamapi;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
            2450.75,
            2462.30,
            2448.90,
            2475.10,
            2468.60
        );

        stockPrices.stream()
                   .forEach(price ->
                       System.out.println("Live Stock Price: ₹" + price)
                   );
    }
}
