package comparable_comparator;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Денис", "Кагане", 220000);
        Employee emp2 = new Employee(3, "Иван", "Петров", 100000);
        Employee emp3 = new Employee(2, "Иван", "Сидоров", 200000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Перед сортировкой");
        System.out.println(list);

        Collections.sort(list, new IdComparator());

        System.out.println("После сортировки");
        System.out.println(list);
    }
}

@AllArgsConstructor
class Employee {
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

