package com.vousutils.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.vousutils.number.UtilsNumber.isNumInRange;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsNumberTest {
    @Test
    @DisplayName("Test isNumInRange")
    void testIsNumInRange() {
        assertAll("isNumInRange",
                () -> assertTrue(isNumInRange(1, 0, 2)),
                () -> assertTrue(isNumInRange(0, 0, 2)),
                () -> assertTrue(isNumInRange(2, 0, 2)),
                () -> assertTrue(isNumInRange(-3, -5, -2)),
                () -> assertTrue(isNumInRange(-5, -5, -2)),
                () -> assertTrue(isNumInRange(-2, -5, -2)),
                () -> assertFalse(isNumInRange(5, 0, 2)),
                () -> assertFalse(isNumInRange(-2, 0, 2)),
                () -> assertFalse(isNumInRange(-18, -17, -10))
        );
    }
}
