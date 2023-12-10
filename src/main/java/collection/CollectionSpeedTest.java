package collection;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionSpeedTest {
    public static void main(String[] args) throws IOException {

        long endTime;
        long startTime;
        int index = 10000000;
        int maxSize = 20000000;

        File file = new File("src/main/resources/input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        StringBuilder sequenceBuilder = new StringBuilder();
        for (int i = 0; i <= maxSize; i++) {
            sequenceBuilder.append(i).append(",");
        }
        String sequence = sequenceBuilder.toString();
        fileOutputStream.write(sequence.getBytes());
        fileOutputStream.close();

        String inputFileName = "src/main/resources/input.txt";
        List<String> list = new ArrayList<>();
        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {
            String string = r.readLine();
            list = Arrays.asList(string.split(","));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new ArrayList<>();
        for (String s : list) {
            arrayList.add(Integer.valueOf(s));
            linkedList.add(Integer.valueOf(s));
        }

        //ArrayList

//        System.out.println(arrayList.get(index));

        startTime = System.currentTimeMillis();
        arrayList.remove(index);
        endTime = System.currentTimeMillis();

        System.out.println("\nArrayList");
        System.out.println("Время исполнения: " + (endTime - startTime));
//        System.out.println(arrayList.get(index));

        //LinkedList
        System.out.println("\n---------------------------------");
//        System.out.println(linkedList.get(index));

        startTime = System.currentTimeMillis();
        linkedList.remove(index);
        endTime = System.currentTimeMillis();

        System.out.println("\nLinkedList");
        System.out.println("Время исполнения: " + (endTime - startTime));
//        System.out.println(linkedList.get(index));

        Files.delete(Path.of("src/main/resources/input.txt"));
    }
}
