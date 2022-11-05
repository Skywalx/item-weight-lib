package com.skywalx.itemweightlib.model;

public record Mass(int grams) {

    public double toKilograms() {
        return this.grams / 1000.0;
    }
}