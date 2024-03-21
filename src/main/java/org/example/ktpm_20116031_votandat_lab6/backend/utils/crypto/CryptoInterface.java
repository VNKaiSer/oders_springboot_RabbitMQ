package org.example.ktpm_20116031_votandat_lab6.backend.utils.crypto;

import org.example.ktpm_20116031_votandat_lab6.backend.enums.CRYPTALGORITHM;

public interface CryptoInterface {
    final CRYPTALGORITHM CRYPT_ALGORITHM = CRYPTALGORITHM.AES;
    final String SECRET_KEY = "s3cr3t-k3y";
    final String SALT = "s3cr3t-s0l";
    String encrypt(String plainText) throws Exception;
    String decrypt(String cipherText) throws Exception;

}
