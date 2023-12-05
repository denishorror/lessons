package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class Comparable_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Денис");
        list.add("Мария");
        list.add("Иван");

        out.println("Перед сортировкой");
        out.println(list);

        Collections.sort(list);

        out.println("После сортировкой");
        out.println(list);
    }
}
