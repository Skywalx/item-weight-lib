package com.skywalx.itemweightlib.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MassTest {

    @Test
    void toKilograms_shouldConvertFromGrams() {
        Mass mass = new Mass(1050);

        double kilograms = mass.toKilograms();

        assertEquals(1.05, kilograms);
    }
}