package generics.stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .sorted((n, e) -> n.getName().compareTo(e.getName()))
                .forEach(e -> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}

