package com.company.giftforbirthday.candy;

public class Chocolate extends Candy{
    @Override
    public void sweetness() {
        System.out.println("Medium sweetness");
    }

    @Override
    public void composition() {
        System.out.println("White and black chocolate");
    }
}
