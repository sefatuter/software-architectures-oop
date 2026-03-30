package com.lesson.march_23_q3;

public class CodexAdapter implements Crypt {

    // Uyumsuz sınıfı içeride tutuyoruz
    private Codex codex;

    // Constructor Injection
    public CodexAdapter(Codex codex) {
        this.codex = codex;
    }

    // Sistem bizden "encrypt" istiyor...
    @Override
    public void encrypt(String text) {
        // ...biz içeride Codex'in anladığı dile çeviriyoruz!
        codex.textToCode(text);
    }

    // Sistem bizden "decrypt" istiyor...
    @Override
    public void decrypt(String text) {
        // ...biz içeride Codex'in anladığı dile çeviriyoruz!
        codex.codeToText(text);
    }
}
/*
Codex sınıfını değiştiremeyiz (belki de dışarıdan indirdiğimiz kapalı bir kütüphane). O yüzden araya çevirmen koyuyoruz.
Kural: Adaptör, uyumlu sisteme (Crypt) implemente edilmeli ve uyumsuz sistemi (Codex) içinde barındırmalıdır (Dependency Injection).

 */