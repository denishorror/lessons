package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println(String.format("Введенное число: %s", i));

//        System.out.println("Введите 2 числа:");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println(String.format("Частное равно: %s", x/y));
//        System.out.println(String.format("Остаток равен: %s", x%y));

//        System.out.println("Напишите пару строк");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println(String.format("Вы написали в первой строке: %s", s1));
//        System.out.println(String.format("Вы написали во второй строке: %s", s2));

//        System.out.println("Напишите строку");
//        String s1 = scanner.next();
//        System.out.println(String.format("Вы написали в первой строке: %s", s1));

        System.out.println("Введите жробное число");
        double d = scanner.nextDouble();
        System.out.println(String.format("Введенное число: %s", d));
    }
}
