package org.example.ktpm_20116031_votandat_lab6.utils.crypto;

import org.example.ktpm_20116031_votandat_lab6.backend.utils.crypto.AESCrypto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AESCryptoTest {

    @Test
    void encrypt() {
        String plantext = "02052002Dat@";
        String excepected = "7pBVURso9IvRqjm89spffkrZ1KrxiNKIk4ZR5oEAses=";
        AESCrypto aesCrypto = new AESCrypto();
        try {
           String actual = aesCrypto.encrypt(plantext);
            assertEquals(excepected, actual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void decrypt() {
        String cipherText = "7pBVURso9IvRqjm89spffkrZ1KrxiNKIk4ZR5oEAses=";
        String expected = "02052002Dat@";
        AESCrypto aesCrypto = new AESCrypto();
        try {
            String actual = aesCrypto.decrypt(cipherText);
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}