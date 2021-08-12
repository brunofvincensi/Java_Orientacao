package com.products.entities;

import java.util.Date;

public class UsedProduct extends Product{

    private String manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag(){

        return "(used) $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";

    }
}
