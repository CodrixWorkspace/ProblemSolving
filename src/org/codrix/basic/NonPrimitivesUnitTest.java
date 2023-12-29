package org.codrix.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonPrimitivesUnitTest {

    public static void modify(Foo a1, Foo b1) {
        a1.num++;
        assertEquals("Assert a1 within modify method", a1.num, 2);

        b1 = new Foo(1);
        b1.num++;
        assertEquals("Assert b1 within modify method", b1.num, 2);

    }

    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        assertEquals(a.num, 1);
        assertEquals(b.num, 1);

        modify(a, b);

        // After Modification
        assertEquals(a.num, 2);
        assertEquals(b.num, 1);
    }
}

class Foo {
    public int num;

    public Foo(int num) {
        this.num = num;
    }
}

