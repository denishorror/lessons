package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Денис");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Колян");

        Iterator<String> iterator = arrayList1.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove(); // Можно удалять в процессе перебора. В циклах так не получится.
        }
        System.out.println(arrayList1); // поэтому тут пусто
    }
}


