package com.mycompany.app;

import io.harness.agent.sdk.HarnessAlwaysRun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App. aaa
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    @HarnessAlwaysRun
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testAppMessageIsNotNull() {
        assertNotNull(new App().getMessage());
    }

    @Test
    public void testAppMessageIsNotBlank() {
        assertFalse(new App().getMessage().isBlank());
    }
}
