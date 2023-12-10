package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionSpeedTest {
    public static void main(String[] args) throws IOException {
        final String PATH = "src/main/resources/input.txt";

        long endTime;
        long startTime;
        int index = 10000000;
        int maxSize = 20000000;

//        File file = new File(PATH);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//        StringBuilder sequenceBuilder = new StringBuilder();
//        for (int i = 0; i <= maxSize; i++) {
//            sequenceBuilder.append(i).append(",");
//        }
//        String sequence = sequenceBuilder.toString();
//        fileOutputStream.write(sequence.getBytes());
//        fileOutputStream.close();

        String inputFileName = PATH;
        List<String> list = new ArrayList<>();
        try (BufferedReader r = new BufferedReader(new FileReader(inputFileName))) {
            String string = r.readLine();
            list = Arrays.asList(string.split(","));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> linkedList = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        for (String s : list) {
            arrayList.add(Integer.valueOf(s));
            linkedList.add(Integer.valueOf(s));
        }
        arrayList.set(0,111);
        linkedList.set(0, 222);

        //ArrayList
        CompareCollectionsSpeed.compareTimeOfRemove(index, arrayList, "ArrayList");

        System.out.println("\n---------------------------------");

        //LinkedList
        CompareCollectionsSpeed.compareTimeOfRemove(index, linkedList, "LinkedList");

//        Files.delete(Path.of(PATH));
    }
}

class CompareCollectionsSpeed {
    public static void compareTimeOfRemove(int index, List<?> list, String comment) {
        long startTime;
        long endTime;

        System.out.println("\n�������� ���������: " + list.get(0));
        System.out.println("�������� �������: " + list.get(index));

        startTime = System.currentTimeMillis();
        list.remove(index);
        endTime = System.currentTimeMillis();

        System.out.println(comment);
        System.out.println("����� ����������: " + (endTime - startTime));
        System.out.println("�������� �������: " + list.get(index));
    }
}
