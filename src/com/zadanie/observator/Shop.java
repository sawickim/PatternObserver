package com.zadanie.observator;

import java.util.Observable;

public class Shop extends Observable {

    private double discount;

    public void setDiscount(double discount){
        this.discount = discount;
        setChanged();
        notifyObservers(discount);
    }

}
