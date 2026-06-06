package com.lesson.my_exercises.Iterator;

/*
Single Responsibility Principle (SRP): Kutu (NameRepository) verileri tutmaktan sorumludur.
 O verilerin üzerinde gezinme sorumluluğunu başka bir sınıfa (NameIterator) devrederek kendi üzerindeki yükü hafifletir.
 */
public class Main {
    public static void main(String[] args) {

        NameRepository repo = new NameRepository();

        for (Iterator iter = repo.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
