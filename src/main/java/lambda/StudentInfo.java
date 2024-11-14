package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
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

        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
        System.out.println("-------------------");
        info.testStudents(students, new StudentChecks() { // Зпись через анонимный класс
            @Override
            public boolean check(Student student) {
                return student.age < 30;
            }
        });

        System.out.println("-------------------");
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("-------------------");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });

        System.out.println("-------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f'; // Более полная запись через лямбда
        });

        System.out.println("-------------------");
        info.testStudents(students, s -> s.age > 8); // Самая короткая запись через лямбда

        System.out.println("-------------------"); // sc лямбда-выражение, которое можно передавать как переиенную
        StudentChecks sc = s -> s.age > 8;
        info.testStudents(students, sc);

        System.out.println("-------------------");
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

//        info.printStudentsOverGrade(students,8);
//        System.out.println("-------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("-------------------");
//        info.printStudentsMixCondition(students,20, 9.5, 'f');
    }

//    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//        for (Student student : students) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> students, int age) {
//        for (Student student : students) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
//        for (Student student : students) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> students, StudentChecks sc) {
        for (Student student : students) {
            if (sc.check(student)) {
                System.out.println(student);
            }
        }
    }
}

interface StudentChecks {
    boolean check(Student student);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}
