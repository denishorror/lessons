package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Денис");
        map1.put(1001, "Иван");
        map1.put(1003, "Мария");
        map1.put(1002, "Николай");
        map1.put(1004, "Денис");
        map1.putIfAbsent(1000, "Петр");
        map1.put(null, "Сергей");
        map1.put(1005, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(10));

        map1.remove(1002);
        System.out.println(map1);

        System.out.println(map1.containsValue("Денис"));
        System.out.println(map1.containsValue("Рамзан"));

        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsKey(500));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
