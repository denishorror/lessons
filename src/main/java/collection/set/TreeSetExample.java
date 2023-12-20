package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student student1 = new Student(" �����",  5);
        Student student2 = new Student(" ����", 1);
        Student student3 = new Student(" �����",  2);
        Student student4 = new Student(" ������",  3);
        Student student5 = new Student(" ���",  4);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student student6 = new Student(" ����",  3);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.tailSet(student6));

        Student student7 = new Student(" ����",  4);
        System.out.println(treeSet.subSet(student6,student7));
        System.out.println(student4.equals(student6));
        System.out.println(student4.hashCode() == student6.hashCode());
    }
}
