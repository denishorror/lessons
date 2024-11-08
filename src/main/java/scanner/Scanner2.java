package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Привет мой друг\nКак поживаешь?\nЧто хорошего? ");

//        String s = scanner.next();
//        System.out.println(s);

//        String s1 = scanner.nextLine();
//        System.out.println(s1);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine()); вот тут NoSuchElementException

//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }

        System.out.println(scanner.next().charAt(2));
    }
}
