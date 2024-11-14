package lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("привет", "как дела", "нормально", "пока");
        list.forEach(System.out::println);

        List<Integer> list2 = List.of(1, 2, 3, 4, 5);
        list2.forEach(e -> {
            System.out.println(e);
            e *= 2;
            System.out.println(e);
        });
    }
}

