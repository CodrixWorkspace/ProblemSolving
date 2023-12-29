package org.codrix.basic;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimitivesUnitTest {


    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
        // Before Modification
        assertEquals("X1 validation within modify method failed", 5, x1);
        assertEquals("Y1 validation within modify method failed", 10, y1);
    }

    @Test
    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {

        int x = 1;
        int y = 2;

        // Before Modification
        assertEquals(1, x);
        assertEquals(2, y);

        modify(x, y);

        // After Modification
        assertEquals("x validation after modify method ", 1, x);
        assertEquals("y validation after modify method ", 2, y);
    }
}