package collection.list;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionSpeedTest {
    public static void main(String[] args) throws IOException {
        final String PATH_TO_INPUT_FILE = "src/main/resources/input.txt";

        long endTime;
        long startTime;
        int index = 10000000;
        int maxSize = 20000000;

        File file = new File(PATH_TO_INPUT_FILE);
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        StringBuilder sequenceBuilder = new StringBuilder();
        for (int i = 0; i <= maxSize; i++) {
            sequenceBuilder.append(i).append(",");
        }
        String sequence = sequenceBuilder.toString();
        fileOutputStream.write(sequence.getBytes());
        fileOutputStream.close();

        List<String> list = new ArrayList<>();
        try (BufferedReader r = new BufferedReader(new FileReader(PATH_TO_INPUT_FILE))) {
            String string = r.readLine();
            list = Arrays.asList(string.split(","));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        for (String s : list) {
            arrayList.add(Integer.valueOf(s));
            linkedList.add(Integer.valueOf(s));
        }
//        arrayList.set(0, 111);
//        linkedList.set(0, 222);

        //ArrayList
        TestCollectionsSpeed.compareTimeOfRemove(index, arrayList, "ArrayList");

        System.out.println("\n---------------------------------");

        //LinkedList
        TestCollectionsSpeed.compareTimeOfRemove(index, linkedList, "LinkedList");

//        Files.delete(Path.of(PATH_TO_INPUT_FILE));
    }
}

class TestCollectionsSpeed {
    public static long compareTimeOfRemove(int index, List<?> list, String comment) {
        long startTime;
        long endTime;

//        System.out.println("\nПроверка коллекции: " + list.get(0));
//        System.out.println("Проверка индекса: " + list.get(index));

        startTime = System.currentTimeMillis();
        list.remove(index);
        endTime = System.currentTimeMillis();

        System.out.println(comment);
        long diff = endTime - startTime;
        System.out.println(String.format("> Время исполнения: %s мс", diff));
//        System.out.println("Проверка индекса: " + list.get(index));

        return diff;
    }
}
