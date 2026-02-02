package com.streamapi;
import java.util.*;
import java.util.stream.Collectors;

class InsuranceClaim {
    private int claimId;
    private String claimType;
    private double claimAmount;

    public InsuranceClaim(int claimId, String claimType, double claimAmount) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = List.of(
            new InsuranceClaim(101, "Health", 45000),
            new InsuranceClaim(102, "Vehicle", 120000),
            new InsuranceClaim(103, "Health", 30000),
            new InsuranceClaim(104, "Property", 200000),
            new InsuranceClaim(105, "Vehicle", 80000),
            new InsuranceClaim(106, "Health", 60000),
            new InsuranceClaim(107, "Property", 150000)
        );

        Map<String, Double> averageClaimByType =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      InsuranceClaim::getClaimType,
                      Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                  ));

        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " → Average Claim: " + avg)
        );
    }
}
