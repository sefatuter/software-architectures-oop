# Proxy Pattern

* Structural tasarım desenidir
* CLient ile ulaşılmak istenen nesne arasına yeni bir katman eklenerek, nesnenin kontrollü bir şekilde kullanılması sağlanır.
* Client işlemin yapıldığı sınıfla direkt iletişim kurmaz.
* Proxy, istemci isteklerini alır, erişim kontrolü, ön belleğe alma, log vb. işlemleri yapar ardından isteği iletir.
* 