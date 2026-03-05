package com.lesson.hashmap;
import java.util.HashMap;
import java.util.Map;
/*

Ex:

    aaabbccbbaaddd  ->  input
    a5b4c2d3        ->  output

    - sortlayıp farklı harf gelene kadar sayarım, basit çözüm O(n)'e gider
    - Dictionary veya hashmap ile frekans tutmak? O(1) Key: Value ile çalışıyor , Map[x] -> Value

 */

public class Main {
    public static void main(String[] args) {
        String input = "aaabbccbbaaddd";
        String s = "";
        Map<Character, Integer> map = new HashMap<>();

        for (char c:  input.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();
            s += k + "" + v;
        }
        System.out.println(s);
    }

}
