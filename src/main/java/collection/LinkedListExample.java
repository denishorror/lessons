package collection;

import lombok.AllArgsConstructor;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Иван", 3);
        Student2 student2 = new Student2("Николай", 2);
        Student2 student3 = new Student2("Елена", 1);
        Student2 student4 = new Student2("Петр", 4);
        Student2 student5 = new Student2("Мария", 3);

        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);

        System.out.println("LinkedList = " + linkedList);
    }
}

@AllArgsConstructor
class Student2 {
    String name;
    int course;

    @Override
    public String toString() {
        return "\nСтудент{" +
                "name = '" + name + "\'" +
                ", course = " + course +
                "}";
    }
}


