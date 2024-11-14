package lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add ("Привет");
        al.add ("Пока");
        al.add ("Ок");
        al.add ("Учим Java");
        al.add ("А именно lambda");

        al.removeIf(element -> element.length() < 5);
        System.out.println(al);
    }

}
