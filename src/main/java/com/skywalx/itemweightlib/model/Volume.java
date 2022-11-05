package com.skywalx.itemweightlib.model;

public record Volume(double cubicMeters) {
    public double toCubicCentimeters() {
        return this.cubicMeters * 1_000_000;
    }
}
