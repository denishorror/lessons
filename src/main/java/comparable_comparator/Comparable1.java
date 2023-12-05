package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Денис");
        list.add("Мария");
        list.add("Иван");

        System.out.println("Перед сортировкой");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("После сортировкой");
        System.out.println(list);
    }
}
