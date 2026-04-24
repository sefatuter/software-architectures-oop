package com.lesson.adapter.march_23_q3;

// Uyumsuz Sınıf (Amerika Fişi)
// Bu sınıf bizim Crypt interface'imizi kullanmıyor. Kendi bildiği metot isimleriyle çalışıyor.
public class Codex {
    public void textToCode(String text) {
        System.out.println("Codex - textToCode: " + text);
    }

    public void codeToText(String text) {
        System.out.println("Codex - codeToText: " + text);
    }
}
/*

Üstteki sınıf Crypt interface'ini kullanarak türetilmediği için
metotları farklıdır. fakat benzer işi yapmaktadır. Bu sınıfın adapter'ini
yazarak CryptA ve CryptB gibi kullanabiliriz

 */