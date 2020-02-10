package com.zadanie.observator;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();

        CarObserver car = new CarObserver();
        PhoneObserver phone = new PhoneObserver();

        car.setPrice(10.0);
        phone.setPrice(10.0);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());

        shop.addObserver(car);
        shop.addObserver(phone);
        shop.setDiscount(10);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
    }

}
