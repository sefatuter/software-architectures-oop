package com.lesson.my_exercises.pattern_examples.q1;

import java.util.ArrayList;
import java.util.List;

/*
1. Tüm yazdırma işlemleri tek bir merkezi kuyruk üzerinden geçmelidir.
2. Eğer birden fazla kuyruk nesnesi oluşursa:
    * bazı belgeler bir kuyruğa,
    * bazıları başka kuyruğa gider,
    * sıralama bozulur,
    * bazı çıktılar kaybolabilir.
3. Bu yüzden sistemde PrintQueueManager sınıfından yalnızca bir tane nesne olmalıdır.
4. Sistemin farklı yerlerinden herkes aynı kuyruk yöneticisine erişebilmelidir.
5. Kuyruk yöneticisi şu işlemleri desteklemelidir:
    * addJob(String documentName)
    * showQueue()
6. Bir belge eklendiğinde sıraya alınsın.
7. showQueue() çağrıldığında sıradaki tüm belgeler ekrana yazdırılsın.
8. Dışarıdan new PrintQueueManager() ile yeni nesne oluşturulamasın.

 */
public class PrintQueueManager {
    public static List<String> jobs = new ArrayList<>();
    private static PrintQueueManager printQueueManager;

    private PrintQueueManager(){}

    public static void addJob(String documentName){
        if (printQueueManager == null){
            printQueueManager = new PrintQueueManager();
        }
        jobs.add(documentName);
    }

    public static void showQueue(){
        System.out.println(jobs);
    }
}
