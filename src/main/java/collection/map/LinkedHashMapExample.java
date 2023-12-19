package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student student1 = new Student(" Денис", "Кагане", 3);
        Student student2 = new Student(" Мария", "Иванова", 1);
        Student student3 = new Student(" Сергей", "Петров", 4);
        Student student4 = new Student(" Игорь", "Сидоров", 2);

        linkedHashMap.put(7.2, student3);
        linkedHashMap.put(7.5, student4);
        linkedHashMap.put(5.8, student1);
        linkedHashMap.put(6.4, student2);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.5));
        System.out.println(linkedHashMap);
    }
}
