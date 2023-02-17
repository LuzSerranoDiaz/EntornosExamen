package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SueldoTest {

    @Test
    void ej9() {
        assertNotEquals(Sueldo.ej9('N',1000,1),1000);
        assertNotEquals(Sueldo.ej9('E',1000,1),1000);
        assertEquals(Sueldo.ej9('R',1000,1),1000);
        assertEquals(Sueldo.ej9('N',1000,0),1000);
        assertEquals(Sueldo.ej9('N',999,1),999);
    }
}