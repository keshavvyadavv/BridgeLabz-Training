package com.encapsulationandpolymorphism.employeemanagementsystem.ecommerceplatform;

class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    public double calculateTax() {
        return getPrice() * 0.12; 
    }

    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}