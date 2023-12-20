package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Денис");
        hashSet.add("Олег");
        hashSet.add("Марина");
        hashSet.add("Игорь");
        hashSet.add("Игорь"); // не добавится в HashSet

        System.out.println(hashSet);
        for (String s : hashSet) {
            System.out.println(s);
        }

        hashSet.remove("Денис");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains("Марина"));
    }
}
