package comparable_comparator;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "�����", "������", 220000);
        Employee emp2 = new Employee(3, "����", "������", 100000);
        Employee emp3 = new Employee(2, "����", "�������", 200000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("����� �����������");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("����� ����������");
        System.out.println(list);
    }

    @AllArgsConstructor
    static class Employee implements Comparable<Employee> {
        int id;
        String name;
        String surname;
        int salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Employee anotherEmp) {
// ������� 1
//            int thisId = this.id;
//            int anotherId = anotherEmp.id;
//            if (thisId == anotherId) {
//                return 0;
//            } else if (thisId < anotherId) {
//                return -1;
//            } else {
//                return 1;
//            }

//������� 2
//            return this.id - anotherEmp.id;

//������� 3
            return Integer.compare(this.id, anotherEmp.id);
        }
    }
}
