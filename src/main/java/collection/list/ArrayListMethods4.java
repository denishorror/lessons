package collection.list;

import java.util.ArrayList;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("�����");
        arrayList1.add("�����");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

    }
}
