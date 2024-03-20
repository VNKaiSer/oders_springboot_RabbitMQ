package org.example.ktpm_20116031_votandat_lab6.utils.crypto;

import java.util.Base64;

public class Base64Crypto implements CryptoInterface {
    @Override
    public String encrypt(String plainText) throws Exception {
        return Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    @Override
    public String decrypt(String cipherText) throws Exception {
        return new String(Base64.getDecoder().decode(cipherText));
    }
}
