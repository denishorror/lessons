package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student student1 = new Student(" Денис", 5);
        Student student2 = new Student(" Миша", 1);
        Student student3 = new Student(" Игорь", 2);
        Student student4 = new Student(" Марина", 3);
        Student student5 = new Student(" Оля", 4);
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
