package generics.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
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

        Map<Integer, List<Student>> map = students.stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .collect(Collectors.groupingBy(Student::getCourse));

        for (Map.Entry<Integer, List<Student>> entry:map.entrySet()){
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue().toString());
        }

        System.out.println("--------------------------------");

                Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(e -> e.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry:map2.entrySet()){
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue().toString());
        }
    }
}
