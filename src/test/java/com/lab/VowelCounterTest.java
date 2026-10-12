package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VowelCounterTest {

    @Test
    void testCountVowels() {
        VowelCounter obj = new VowelCounter();
        assertEquals(3, obj.countVowels("Hello World"));
    }

    @Test
    void testNoVowels() {
        VowelCounter obj = new VowelCounter();
        assertEquals(0, obj.countVowels("sky"));
    }
}