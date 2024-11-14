package generics.stream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 8, 2, 4, 3);

        int result = list.stream()
                .reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
        System.out.println("--------------------------------");

        int result2 = list.stream()
                .reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);
        System.out.println("--------------------------------");

//        List<Integer> emptyList = new ArrayList<>();
//        int result3 = emptyList.stream()
//                .reduce((accumulator, element) -> accumulator * element).get();
//        System.out.println(result3);
    }
}
