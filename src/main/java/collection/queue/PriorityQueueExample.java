package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
//        natural order 1, 4, 7, 8, 10
        System.out.println(priorityQueue);
//        но при выводе коллекции сортировки нет!
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
//        однако при использовании peek удаляется приоритетный элемент!
    }
}
