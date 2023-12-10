package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
//        List<Number> list1 = new ArrayList<Integer>();
//        List<Object> list2 = new ArrayList<Integer>();
        List<?> list = new ArrayList<Integer>();
//        list.add("hello");

        // ��������� ���� �� Number � ���� �� Integer
        List<? extends Number> list3 = new ArrayList<Integer>();
        // ��������� ���� �� Number � ���� �� Object
        List<? super Number> list4 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("��");
        list2.add("������");
        list2.add("����");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        LinkedList<Integer> ali = new LinkedList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));

        // �� �������� �.�. ����� �� ������� Number
//        ArrayList<String> als = new ArrayList<>();
//        System.out.println(summ(als));
    }

    static void showListInfo (List<?> list) {
        System.out.println("��� LIST �������� ��������� ��������: " + list);
    }

    public static double summ(List<? extends Number> al){
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
