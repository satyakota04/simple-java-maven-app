package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App. aaw
 */
public class App2Test
{
    @Test
    public void testAppConstructor2() {
        App2 app1 = new App2();
        App2 app2 = new App2();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage2()
    {
        App2 app = new App2();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testApp2MessageIsNotNull() {
        assertNotNull(new App2().getMessage());
    }

    @Test
    public void testApp2MessageIsNotBlank() {
        assertFalse(new App2().getMessage().isBlank());
    }
}
