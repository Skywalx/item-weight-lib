package com.skywalx.itemweightlib.model;

public record ItemCollection(int amount, Item item) {

    public Mass weightForTotalAmount() {
        return new Mass(amount * item.mass().grams());
    }
}
