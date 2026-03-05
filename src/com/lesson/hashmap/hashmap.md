### HashMap Nedir? (The Dictionary Concept)

**HashMap**, verileri **Key-Value (Anahtar-Değer)** çiftleri olarak tutan bir koleksiyondur.

*   **Key (Anahtar):** Benzersizdir (Unique). Bir kelime sözlükte sadece bir kez geçer.
*   **Value (Değer):** O anahtara karşılık gelen veridir. (Sözlükteki anlamı veya senin örneğindeki harf sayısı).

**Gerçek Hayat Analojisi: Emanet Dolapları**
Bir spor salonuna gittin. Sana bir numara (Key: 105) verdiler. Eşyalarını (Value: Çanta) o dolaba koydun.
*   Çantanı geri almak istediğinde tüm dolapları tek tek gezmezsin (**O(n) değil**).
*   Direkt 105 numaralı dolaba gidersin ve çantanı alırsın (**O(1) - Constant Time**).

---

### Neden HashMap Kullanırız? (Architect's Perspective)

1.  **Hız:** Milyonlarca veri olsa bile, bir anahtarı bulma hızı değişmez.
2.  **Esneklik:** İndislerle (`0, 1, 2...`) uğraşmazsın. Anahtarın bir `String`, `Integer` veya senin oluşturduğun bir `Object` olabilir.
3.  **Null İzni:** Java'daki HashMap bir adet `null` key ve birden fazla `null` value kabul eder.

---

### Senin Örneğinin Çözümü (Frequency Count)

Senin örneğindeki `aaabbccbbaaddd` -> `a5b4c2d3` dönüşümünü HashMap kullanarak en verimli şekilde yapalım.

**Mantık:**
1. Harfleri tek tek oku.
2. Harf Map'te var mı?
    - **Yoksa:** Harfi anahtar yap, değerini `1` yap. (`put(char, 1)`)
    - **Varsa:** Mevcut değeri al, `1` artır, tekrar içeri koy. (`put(char, oldVal + 1)`)

---


## Why Use HashMap in Architecture?

1.  **Caching:** Storing database results in a HashMap (as a cache) avoids expensive DB queries.
2.  **Indexing:** Rapidly finding a User object by their `userId`.
3.  **Data Grouping:** Grouping a list of products by their category ID.
4.  **Performance Optimization:** Reducing O(n^2) nested loops to O(n) by using a map to look up items instantly.

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        
        capitalCities.get("England");
        capitalCities.remove("England");
        capitalCities.clear();
    }
}
```