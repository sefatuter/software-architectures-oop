# Mediator Pattern

-> Nesneler arası bağımlılıkları azaltmaya olanak sağlayan behavioural tasarım desenidir.

-> nesneler arasındaki doğrudan iletişimi kısıtlar ve onların yalnızca aracı bir nesne aracılığıyla işbirliği yapmaya zorlar.

-> uçaklardaki kontrol kulesi aracı olarak bulunur. somut örnek, hava trafiği karmaşıklığını önlemek.


### Neden Mediator Kullanırız? (Mimar Gözüyle)
Uçakların birbirleriyle iletişim kurduğunu hayal et:
Uçak1: "Uçak2, ben iniyorum, sen inme."
Uçak2: "Uçak3, ben inemiyorum, pas geç."
Eğer 10 tane uçak varsa ve hepsi birbiriyle doğrudan konuşursa (Spagetti Kod), sistem kilitlenir. Mimaride buna **Sıkı Bağlılık (Tight Coupling)** denir.

**Çözüm (Mediator):** Hiçbir uçak diğer uçağı tanımaz. Herkes **Kule (Mediator)** ile konuşur. Kule kimin inip kimin kalkacağına karar verip emirleri dağıtır.

Hadi notlarındaki bu mükemmel örneği, defterine geçirebileceğin "Hap Bilgi" formatına çevirelim. Kodu biraz daha mantıklı bir "iletişim" akışına getirdim (Uçakların birbirinden haberdar olmasını engelleyen o mimariyi göstermek için).

---
**Amaç:** Birbiriyle etkileşime girmesi gereken nesnelerin (Uçaklar), birbirleriyle *doğrudan* konuşmasını engelleyip, tüm iletişimi tek bir merkez (Kule) üzerinden sağlamaktır.

*   **Chat Uygulaması:** WhatsApp veya Discord grupları Mediator deseninin en yaygın örneğidir. Sen mesajı gruptaki 50 kişiye tek tek göndermezsin; Sunucuya (Mediator) gönderirsin, sunucu o mesajı diğer 49 kişiye dağıtır.
*   **Observer ile Farkı Nedir?**
    *   *Observer'da* (Bir önceki konu), bir yayıncı (Product) ve onu dinleyen sessiz aboneler (Customers) vardır. İletişim **Tek Yönlüdür** (1 to N).
    *   *Mediator'da*, herkes birbiriyle konuşmak ister. İletişim **Çift Yönlüdür** ve çok karmaşıktır (N to N). Mediator ortaya geçip bu karmaşayı (Star yapısına) çevirir.


### 🔄 Akış Diyagramı (Flow)

**Senaryo:** THY uçağı piste inmek istiyor. Pegasus uçağı havada bekliyor.

```text
[Main] 
  └─> thy.land() komutunu verir.
        │
        ▼
[CommercialPlane: THY] sınıfındaki land() metoduna girilir.
        │
        ├──> Ekrana yazar: "THY-1453: Kule, iniş izni istiyorum!"
        │
        ├──> tower.requestLanding(this) çağrılır. (Uçak, KULE ile konuşur!)
                │
                ▼
      [AirportTower: Kule] sınıfındaki requestLanding() metoduna girilir.
                │
                ├──> 1. ADIM (İzni ver): İsteği yapan uçağa (THY) mesaj at.
                │       └─> thy.receiveMessage("İniş izni onaylandı")
                │             │
                │             ▼ Ekrana yazar: "THY duydu -> İniş izni onaylandı"
                │
                ├──> 2. ADIM (Diğerlerini Uyar): Sistemdeki tüm uçakları (for döngüsüyle) tara.
                        │
                        └─> Döngü Pegasus'a geldiğinde:
                              pegasus.receiveMessage("Başka uçak iniyor, beklemede kal!")
                                    │
                                    ▼ Ekrana yazar: "Pegasus duydu -> Başka uçak iniyor..."
```