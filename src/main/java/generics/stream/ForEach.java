package generics.stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array)
//                .forEach(value -> {
//                    System.out.println(value);
//                });
        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
