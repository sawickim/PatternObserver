package com.zadanie.observator;

import java.util.Observable;
import java.util.Observer;

public class PhoneObserver implements Observer {

    public double price;

    public double getPrice() {
        return price;
    }

    public PhoneObserver setPrice(double price) {
        this.price = price;
        return this;
    }

    public PhoneObserver(double price) {
        this.price = price;
    }

    public PhoneObserver() {
        this.price = price;
    }

    @Override
    public void update(Observable o, Object discount) {
        price = price - (price * (double)discount/100);
        setPrice(price);
    }
}
