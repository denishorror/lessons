package lambda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
