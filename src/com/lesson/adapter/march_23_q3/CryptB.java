package com.lesson.adapter.march_23_q3;

public class CryptB implements Crypt {
    @Override
    public void encrypt(String text) {
        System.out.println("CryptB - Encrypt: " + text);
    }

    @Override
    public void decrypt(String text) {
        System.out.println("CryptB - Decrypt: " + text);
    }
}