package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    @Test
    void testIsPerfectNumber() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(8128));

        assertFalse(perfectNumbers.isPerfectNumber(88));
        assertFalse(perfectNumbers.isPerfectNumber(27));
    }


}