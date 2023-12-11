package collection.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Денис");
        vector.add("Миша");
        vector.add("Олег");
        vector.add("Катя");
        vector.add("Рамзан");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(2));
    }
}
