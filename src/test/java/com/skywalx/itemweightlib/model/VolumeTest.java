package com.skywalx.itemweightlib.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

    @Test
    void toCubicMeters_shouldConvertCubicCentimetersToCubicMeters() {
        Volume volume = new Volume(10);

        double toCubicCentimeters = volume.toCubicCentimeters();

        assertEquals(10_000_000, toCubicCentimeters);
    }

}