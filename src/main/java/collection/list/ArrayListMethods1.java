package collection.list;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("�����");
        arrayList1.add(1,"����");
        // arrayList1.add(6,"����"); ��� ������

        printArrayList(arrayList1);
        System.out.println();

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        arrayList1.set(1, "����");
        arrayList1.remove(0);
        printArrayList(arrayList1);
    }

    private static void printArrayList(ArrayList<String> arrayList1) {
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
    }
}
