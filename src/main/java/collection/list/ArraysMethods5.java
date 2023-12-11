package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArraysMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("�����");
        arrayList1.add("�����");
        System.out.println("ArrayList = " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("����");
        arrayList2.add("�����");
//        arrayList2.add("�����");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

        List<String> subList = arrayList1.subList(1, 3);
        System.out.println("SubList = " + subList);
        subList.add("�����");
        System.out.println("SubList = " + subList);
        System.out.println("ArrayList = " + arrayList1); //����� ��������� � ������������ list
        arrayList1.add("�����");
        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("SubList = " + subList); ������ - ���� ������ ����� subView

        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]); // ����� ������ 0 � java ���� ��������� ������ ������

        for (String s : array2) {
            System.out.println(s);
        }

        List<Integer> list1 = List.of(2, 3, 4);
        System.out.println(list1);
//        list1.add(100); ������ �.�. ���� unmodifiable

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }
}
