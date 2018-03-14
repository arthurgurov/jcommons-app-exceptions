package com.arthurgurov.jcommons.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnexpectedExceptionTest {

    @Test
    public void testToString() {
        assertEquals("Error 00000000. Unexpected exception", new UnexpectedException().toString());
    }
}
