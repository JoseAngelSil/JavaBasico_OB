package PckMapas;

import java.util.HashMap;
import java.util.Map;
public class Mapas {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "Jose Angel");
        map.put("key2", "Jose");
        map.put("key3", "Jose Alfredo");
        System.out.println(map);

        for (String keyV:
             map.values()) {
            System.out.println(keyV);
        }
    }
}
