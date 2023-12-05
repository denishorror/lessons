package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class Comparable_2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Денис", "Кагане", 220000);
        Employee emp2 = new Employee(3, "Иван", "Петров", 100000);
        Employee emp3 = new Employee(2, "Иван", "Сидоров", 200000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        out.println("Перед сортировкой");
        out.println(list);

        Collections.sort(list);

        out.println("После сортировки");
        out.println(list);
    }

    static class Employee implements Comparable<Employee> {
        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

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
// Вариант 1
//            int thisId = this.id;
//            int anotherId = anotherEmp.id;
//            if (thisId == anotherId) {
//                return 0;
//            } else if (thisId < anotherId) {
//                return -1;
//            } else {
//                return 1;
//            }

//Вариант 2
//            return this.id - anotherEmp.id;

//Вариант 3
            return Integer.compare(this.id, anotherEmp.id);
        }
    }
}
