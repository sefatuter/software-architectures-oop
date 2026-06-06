package com.lesson.my_exercises.state;
/*
Strategy vs. State Farkı (En Klasik Sınav Sorusu):
    - Strategy deseninde nesnenin stratejisi (nasıl ödeme yapacağı) genellikle istemci (Main) tarafından değiştirilir (Dışarıdan müdahale).
    -  State deseninde ise nesne kendi durumunu (ruh halini) kendi içinden (Durum sınıfları üzerinden) değiştirir. İstemci (Main) durumu bilmez, sadece tuşa basar.

 */
public class Main {
    public static void main(String[] args) {

        TVContext tv = new TVContext();

        tv.pressPowerButton();
        tv.pressPowerButton();

    }
}
