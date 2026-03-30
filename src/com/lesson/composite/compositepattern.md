# Composite Pattern

-> Nesneleri ağaç halinde oluşturmamıza ve bu ağacın dalları tek tek 
nesnelermiş gibi çalışmamıza olanak sağlayan yapıdır.
D = Developer


                   CEO  (Composite / Dal)
                    |   
                    |
                Director  (Composite / Dal)
                    |
                    |
                 Manager  (Composite / Dal)
                    |
           _________|_________
          |         |         |
     Team Leader  Team L.2  Team L.3  (Composite / Dal)
          |
     _____|_____
    |     |     |
    D1    D2    D3  (Leaf / Yaprak / Junior)

-> Bazen nesneler arasında bir "Ağaç Hiyerarşisi" (Tree Structure) kurmamız gerekir. Bilgisayarındaki klasör sistemini düşün: Bir klasörün içinde dosyalar olabilir, ama aynı zamanda başka klasörler de olabilir.
Bir CEO'nun altında müdürler vardır, müdürlerin altında takım liderleri, onların altında da yazılımcılar vardır.

Sorun: CEO'ya "Bütün şirketinin maaşını hesapla" dediğinde CEO, müdürleri mi dönecek, yazılımcıları mı?

Çözüm (Composite): Hepsine ortak bir kimlik (Interface/Abstract Class) ver! Dal (Composite) ile Yaprağı (Leaf) birbirinden ayırmadan, sanki hepsi aynı nesneymiş gibi davran.

- Component (Temel Yapı): Developer sınıfı. Herkesin ortak atası.
- Composite (Dal): SoftwareDeveloper sınıfı. Altında başka yazılımcılar barındırabilen kişiler (Manager, Senior vb.).
- Leaf (Yaprak): Junior sınıfı. Hiyerarşinin en altı. Altında kimse olamaz.
