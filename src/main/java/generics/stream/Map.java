package generics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> list = List.of("привет", "как дела", "нормально", "пока");
        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .toList();
        list2.forEach(System.out::println);

        System.out.println("------------------------");

        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("-----------");
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .toArray();
//        Arrays.stream(array).forEach(System.out::println);

        Set<String> set = new TreeSet<>();
        set = Set.of("privet", "kak dela?", "normalno", "poka");
        set.forEach(System.out::println);
        System.out.println("-----------");
        Set<Integer> set2 = set.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        set2.forEach(System.out::println);
    }
}
