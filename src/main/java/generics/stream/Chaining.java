package generics.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Chaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e)
                .getAsInt();
        System.out.println(result);
        System.out.println("--------------------------------");

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

        students.stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase(Locale.ROOT));
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
    }
}
