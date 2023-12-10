package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);

        Employee3 emp1 = new Employee3(100, "Денис", "", 12345);
        Employee3 emp2 = new Employee3(15, "Иван", "", 6542);
        Employee3 emp3 = new Employee3(123, "Петр", "", 8542);
        Employee3 emp4 = new Employee3(15, "Мария", "", 5678);
        Employee3 emp5 = new Employee3(182, "Коля", "", 125);
        Employee3 emp6 = new Employee3(15, "Саша", "", 9874);
        Employee3 emp7 = new Employee3(250, "Елена", "", 1579);

        List<Employee3> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList, new Employee3(182, "Коля", "", 125));
        System.out.println(index2);

        int[]array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}


