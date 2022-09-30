package org.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeNumberTest {
    GradeNumber number = new GradeNumber();

    @Test
    void testMethod1(){
        assertEquals('F', number.gradeNumber(0));
    }

    @Test
    void testMethod2(){
        assertEquals('D', number.gradeNumber(33));
    }

    @Test
    void testMethod3(){
        assertEquals('C', number.gradeNumber(50));
    }

    @Test
    void testMethod4(){
        assertEquals('B', number.gradeNumber(60));
    }

    @Test
    void testMethod5(){
        assertEquals('A', number.gradeNumber(80));
    }

    @Test
    void testMethod6(){
        assertThrows(IllegalArgumentException.class,
                () ->{number.gradeNumber(-1);
        });
    }
}