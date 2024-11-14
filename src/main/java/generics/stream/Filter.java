package generics.stream;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Student> students1 = students.stream()
                .filter(student ->
                        student.getAge() >22 && student.getAvgGrade() < 7.2)
                .toList();
        students1.forEach(System.out::println);
    }
}
