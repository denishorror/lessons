package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo2 {
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

        StudentInfo2 info = new StudentInfo2();

//        System.out.println("-------------------");
//        info.testStudents2(students, new StudentChecks() { // Зпись через анонимный класс
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });

        System.out.println("-------------------");
        info.testStudents2(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("-------------------");
        info.testStudents2(students, (Student s) -> {
            return s.age < 30;
        });

        System.out.println("-------------------");
        info.testStudents2(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f'; // Более полная запись через лямбда
        });

        System.out.println("-------------------");
        info.testStudents2(students, s -> s.age > 8); // Самая короткая запись через лямбда

        System.out.println("-------------------"); // sc лямбда-выражение, которое можно передавать как переиенную
        Predicate<Student> sc = s -> s.age > 8;
        info.testStudents2(students, sc);

        System.out.println("-------------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(students);

        System.out.println("-------------------");
        Collections.sort(students, (std1, std2) -> std1.course - std2.course);
        System.out.println(students);

    }

    void testStudents2(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student student : students) {
            if (pr.test(student)) {
                System.out.println(student);
            }
        }
    }
}
//
//interface StudentChecks2 {
//    boolean check(Student student);
//}

//class CheckOverGrade2 implements StudentChecks2 {
//    @Override
//    public boolean check(Student student) {
//        return student.avgGrade > 8;
//    }
//}
