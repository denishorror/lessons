package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<Double, Student> hashTable = new Hashtable<>(16, 0.75f);

        Student student1 = new Student(" Денис", "Кагане", 3);
        Student student2 = new Student(" Мария", "Иванова", 1);
        Student student3 = new Student(" Сергей", "Петров", 4);
        Student student4 = new Student(" Игорь", "Сидоров", 2);

        hashTable.put(7.8, student1);
        hashTable.put(9.3, student2);
        hashTable.put(5.8, student3);
        hashTable.put(6.0, student4);
//        hashTable.put(null, student4); нельзя
//        hashTable.put(6.0, null); нельзя

        System.out.println(hashTable);
    }
}
