package io.github.benwhitehead.java.broken_test;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class BrokenTest {

    @Test
    public void broken() throws Exception {
        assertFalse("Test is broken", true);
    }

}
