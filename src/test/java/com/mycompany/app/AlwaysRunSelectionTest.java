package com.mycompany.app;

import io.harness.agent.sdk.HarnessAlwaysRun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlwaysRunSelectionTest {

    @Test
    @HarnessAlwaysRun
    void annotatedAlwaysRuns() {
        assertEquals(1, AlwaysRunTarget.marker());
    }

    @Test
    void unannotatedCanSkip() {
        assertEquals(2, SkippableTarget.marker());
    }
}
