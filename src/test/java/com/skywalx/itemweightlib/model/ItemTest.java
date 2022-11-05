package com.skywalx.itemweightlib.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void mass_shouldMultiplyVolumeByMaterialDensity() {
        Item item = new Item(new Material("wood", 745000), new Volume(2));

        Mass mass = item.mass();

        assertEquals(1490, mass.toKilograms());
    }

}