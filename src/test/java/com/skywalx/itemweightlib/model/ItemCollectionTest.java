package com.skywalx.itemweightlib.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemCollectionTest {

    @Test
    void weightForTotalAmount_shouldMultiplyItemWeightByAmount() {
        Item item = new Item(new Material("wood", 745000), new Volume(10));
        ItemCollection itemCollection = new ItemCollection(2, item);

        Mass mass = itemCollection.weightForTotalAmount();

        assertEquals(14900, mass.toKilograms());
    }
}