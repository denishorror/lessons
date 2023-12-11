package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("�����");
        arrayList1.add("�����");

        Iterator<String> iterator = arrayList1.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove(); // ����� ������� � �������� ��������. � ������ ��� �� ���������.
        }
        System.out.println(arrayList1); // ������� ��� �����
    }
}


