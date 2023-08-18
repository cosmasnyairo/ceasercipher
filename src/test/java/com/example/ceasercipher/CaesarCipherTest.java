package com.example.ceasercipher;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testShiftInput() {
        String original = "Shift";
        String encrypted = CaesarCipher.encrypt(original, 6);
        assertEquals("Ynolz", encrypted);
    }

    @Test
    public void testHelloWorld() {
        String original = "Hello, World!";
        String encrypted = CaesarCipher.encrypt(original, 4);
        assertEquals("Lipps, Asvph!", encrypted);
    }

     @Test
    public void testHi() {
        String original = "HI";
        String encrypted = CaesarCipher.encrypt(original, 2);
        assertEquals("JK", encrypted);
    }
}
