package comparable_comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee2 implements Comparable {
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
    public int compareTo(Object o) {
        //не важно что тут, оно переопределиться вторым параметром
        return 0;
    }
}