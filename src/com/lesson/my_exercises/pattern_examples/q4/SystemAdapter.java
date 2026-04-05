package com.lesson.my_exercises.pattern_examples.q4;

public class SystemAdapter implements YeniNesilMuhasebe{
    private EDevletFaturaSistemi eDevletFaturaSistemi;
    private String tarih;

    public SystemAdapter(EDevletFaturaSistemi eDevletFaturaSistemi, String tarih){
        this.eDevletFaturaSistemi = eDevletFaturaSistemi;
        this.tarih = tarih;
    }

    @Override
    public void faturaKes(String musteriAdi, double tutar) {
        eDevletFaturaSistemi.submitInvoiceData(tutar, musteriAdi, this.tarih);
    }
}
