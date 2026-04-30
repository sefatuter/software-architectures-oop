# Strategy Design Pattern

-> Behavioural Tasarım Desenidir

-> Bir nesnenin davranışını onu farklı stratejilere dahil ederek dinamik olarak değiştirmeye olanak tanır.

-> Bu pattern, bir nesnenin statik olarak tek bir algoritma ve davranış seçmek yerine, run time'da birden fazla algoritma ve davranış arasından seçim yapmasına olanak tanır.

-> open-closed principlea uygun SOLID

### STRATEGY PATTERN (Strateji Deseni)

**Amaç:** Bir işlemi yapmanın birden fazla yolu (algoritması) varsa, bu yolları koca bir `if-else` bloğuna yığmak yerine, her birini ayrı bir sınıf (Strateji) yapıp **çalışma zamanında (runtime) tak-çıkar** mantığıyla kullanmaktır.

*   **Felsefesi:** "Nasıl yapılacağına ana sınıf değil, seçilen strateji karar versin."


1.  **If-Else Katili:** Eğer bu deseni kullanmasaydık `PaymentProcessor` içinde şöyle bir çirkinlik olacaktı:
    `if(type == "KrediKarti") { ... } else if (type == "PayPal") { ... }`
2.  **Open/Closed Prensibi:** Yarın sisteme `BitcoinStrategy` eklemek istersen, mevcut hiçbir koda (Processor'a veya Main'e) dokunmazsın. Sadece yeni bir sınıf açar ve `implements PaymentStrategy` dersin. Sistem gelişime açık, değişime kapalıdır.
3.  **Dependency Injection (DI):** Daha önce öğrendiğimiz *Constructor Injection* mantığının birebir aynısını burada "Strateji enjekte etmek" için kullandık! (Mimarilerin nasıl birbiriyle bağlandığını görüyor musun?)

Bu desen, bir oyunda karakterin silahını değiştirmesi (Kılıç Stratejisi -> Yay Stratejisi) gibi durumlarda da birebir kullanılır. Çok güçlüdür!

Sıradaki tasarım desenimiz nedir?