package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student(" Денис", "Кагане", 3);
        Student student2 = new Student(" Мария", "Иванова", 1);
        Student student3 = new Student(" Сергей", "Петров", 4);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        System.out.println(map);

        Student student4 = new Student(" Денис", "Кагане", 3);
        Student student5 = new Student(" Игорь", "Сидоров", 4);
        boolean result = map.containsKey(student4);
        System.out.println(result);
        System.out.println(student1.equals(student4));

        System.out.println(student1.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());
    }
}
