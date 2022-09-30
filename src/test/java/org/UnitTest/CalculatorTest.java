package org.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testMethod(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
        assertEquals(7, calc.add(4, 3));
        assertNotEquals(12, calc.add(3,8));
        assertTrue(calc.add(7, 3) == 10);
        assertFalse(calc.add(3, 5) == 9);
    }

    @Test
    void testMethod2(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
        assertEquals(12, calc.add(4, 3));
        assertNotEquals(12, calc.add(3,8));
        assertTrue(calc.add(7, 3) == 21);
        assertFalse(calc.add(3, 5) == 9);
    }

}