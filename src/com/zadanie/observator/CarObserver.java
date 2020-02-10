package com.zadanie.observator;

import java.util.Observable;
import java.util.Observer;

public class CarObserver implements Observer {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarObserver() {
        this.price = price;
    }

    @Override
    public void update(Observable o, Object discount) {
        price = price - (price * (double)discount/100);
        setPrice(price);
    }
}
