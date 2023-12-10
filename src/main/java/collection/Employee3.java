package collection;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee3 implements Comparable<Employee3> {
    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee3 another”mployee) {
        int result = this.id - another”mployee.id;
        if (result == 0) {
            result = this.name.compareTo(another”mployee.name);
        }
        return result;
    }
}