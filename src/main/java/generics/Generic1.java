package generics;

import java.util.ArrayList;
import java.util.List;

public class Generic1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("�����");
        list.add("������");
        list.add("�������");
        list.add("�������");
//        list.add(new Car());

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}

class Car {}
