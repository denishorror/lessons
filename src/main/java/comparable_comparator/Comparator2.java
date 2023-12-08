package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(1, "�����", "������", 220000);
        Employee2 emp2 = new Employee2(3, "����", "������", 100000);
        Employee2 emp3 = new Employee2(2, "����", "�������", 200000);
        list.add(emp3);
        list.add(emp2);
        list.add(emp1);

        System.out.println("����� �����������");
        System.out.println(list);

        //������ ������ �������� ��� ������ ������ ���������
        Collections.sort(list, new SalaryComparator2());

        System.out.println("����� ����������");
        System.out.println(list);
    }
}

class NameComparator2 implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator2 implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary - emp2.salary;
    }
}

