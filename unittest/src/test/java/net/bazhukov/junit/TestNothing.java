package net.bazhukov.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNothing {
    @Test
    public void testAEqA() {
        System.out.println("TestNothing running");
        assertEquals("a", "a");
    }
}

