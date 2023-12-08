package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "�����", "������", 220000);
        Employee emp2 = new Employee(3, "����", "������", 100000);
        Employee emp3 = new Employee(2, "����", "�������", 200000);
        list.add(emp3);
        list.add(emp2);
        list.add(emp1);

        System.out.println("����� �����������");
        System.out.println(list);

        Collections.sort(list, new SalaryComparator());

        System.out.println("����� ����������");
        System.out.println(list);
    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

