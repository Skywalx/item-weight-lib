package com.skywalx.itemweightlib.model;

public record Item(Material material, Volume volume) {

    public Mass mass() {
        double massInGrams = this.material.densityInGramsPerCubicMeters() * this.volume.cubicMeters();
        return new Mass((int) (massInGrams));
    }
}
