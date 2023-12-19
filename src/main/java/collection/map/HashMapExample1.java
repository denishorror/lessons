package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "�����");
        map1.put(1001, "����");
        map1.put(1003, "�����");
        map1.put(1002, "�������");
        map1.put(1004, "�����");
        map1.putIfAbsent(1000, "����");
        map1.put(null, "������");
        map1.put(1005, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(10));

        map1.remove(1002);
        System.out.println(map1);

        System.out.println(map1.containsValue("�����"));
        System.out.println(map1.containsValue("������"));

        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsKey(500));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
