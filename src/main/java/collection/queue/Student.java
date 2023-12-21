package collection.queue;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Student implements Comparable<Student> {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    final String name;
    final int course;

    @Override
    public int compareTo(Student otherStudent) {
        return this.course - otherStudent.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
