package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeImmutableExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student(" Денис", "Кагане", 3);
        Student student2 = new Student(" Мария", "Иванова", 1);
        Student student3 = new Student(" Сергей", "Петров", 4);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        System.out.println(map);
        System.out.println(map.containsKey(student1));
        System.out.println(student1.hashCode());
        student1.course = 4;
        System.out.println(student1.hashCode());
        System.out.println(map.containsKey(student1));

    }
}
