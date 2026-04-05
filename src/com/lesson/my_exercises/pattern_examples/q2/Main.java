package com.lesson.my_exercises.pattern_examples.q2;
/*
Görev: RPG Oyun Karakteri Yaratıcısı

Kurallar:

1. Oyundaki karakterler (GameCharacter sınıfı) tek bir merkezden ve standart bir yapıyla oluşturulmalıdır.
2. Bir karakterin "Adı" ve "Sınıfı (Savaşçı, Okçu vb.)" kesinlikle olmak zorundadır.
3. Ancak karakterin "Silahı", "Zırhı", "Binek Hayvanı" ve "Özel Yeteneği" tamamen isteğe bağlıdır. Bazı karakterlerde hiçbiri olmayabilir, bazılarında hepsi olabilir.
4. Nesne yaratılırken dışarıdan new GameCharacter("Arthur", "Savaşçı", null, "Çelik Zırh", null, null) gibi içi null kaynayan, okunması imkansız devasa bir yapıcı metot (constructor) KESİNLİKLE kullanılamaz.
5. Bir karakter tamamen yaratılıp oyuna doğduktan sonra özellikleri dışarıdan değiştirilememelidir (Ana sınıfta setSilah() gibi setter metotları olmamalıdır - Immutable kuralı).
6. Karakter yaratma işlemi adım adım, okunaklı ve metotlar arka arkaya zincirlenerek (method chaining) yapılabilmelidir.
7. Dışarıdan doğrudan new GameCharacter() ile nesne oluşturulamasın.


 */
public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter.Builder()
                .setName("Sally").setRank("Warrior").build();


        System.out.println(gameCharacter);
    }
}
