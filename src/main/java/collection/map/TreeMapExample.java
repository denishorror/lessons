package collection.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student(" Денис", "Кагане", 3);
        Student student2 = new Student(" Мария", "Иванова", 1);
        Student student3 = new Student(" Сергей", "Петров", 4);
        Student student4 = new Student(" Игорь", "Сидоров", 2);
        Student student5 = new Student(" Василий", "Смирнов", 1);
        Student student6 = new Student(" Саша", "Капустин", 3);
        Student student7 = new Student(" Елена", "Сидорова", 4);
        treeMap.put(5.8, student1);
        treeMap.put(9.1, student7);
        treeMap.put(6.4, student2);
        treeMap.put(7.5, student4);
        treeMap.put(7.2, student3);
        treeMap.put(8.2, student6);
        treeMap.put(7.9, student5);

        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(7.2));
        System.out.println(treeMap.headMap(7.3));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }
}
