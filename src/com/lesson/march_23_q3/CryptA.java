package com.lesson.march_23_q3;

public class CryptA implements Crypt {
    @Override
    public void encrypt(String text) {
        System.out.println("CryptA - Encrypt: " + text);
    }

    @Override
    public void decrypt(String text) {
        System.out.println("CryptA - Decrypt: " + text);
    }
}