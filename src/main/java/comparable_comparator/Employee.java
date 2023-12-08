package comparable_comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
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