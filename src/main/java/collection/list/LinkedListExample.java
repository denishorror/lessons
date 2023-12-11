package collection.list;

import lombok.AllArgsConstructor;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        final String LINKED_LIST_EQUALS = "LinkedList = ";

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

        System.out.println(LINKED_LIST_EQUALS + linkedList);
        System.out.println(linkedList.get(2));

        Student2 student6 = new Student2("Денис", 3);
        Student2 student7 = new Student2("Игорь", 4);
        linkedList.add(student6);
        System.out.println(LINKED_LIST_EQUALS + linkedList);
        linkedList.add(1, student7);
        System.out.println(LINKED_LIST_EQUALS + linkedList);
        linkedList.remove(3);
        System.out.println(LINKED_LIST_EQUALS + linkedList);
    }
}

@AllArgsConstructor
class Student2 {
    String name;
    int course;

    @Override
    public String toString() {
        return "\nСтудент {" +
                "name = '" + name + "\'" +
                ", course = " + course +
                "}";
    }
}


