package com.medwarehouse;

import java.util.*;

class Medicine {
    String name;
    int expiryDate; 

    public Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " -> Expiry: " + expiryDate;
    }
}
