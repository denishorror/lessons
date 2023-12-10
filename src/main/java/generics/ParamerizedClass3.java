package generics;

public class ParamerizedClass3 {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Денис");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);
//        Integer i2 = info2.getValue();
    }

    //overload не работает т.к. компилятор удалит информацию о generics и сигнатуры будут равны
//    public void abs (Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abs (Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abs(Info<String> info) {
        String s = info.getValue();
    }
}

//overwrite не работает т.к. компилятор видит информацию о generics и несмотря на то, что сигнатуры будут равны - не даст
//class Child extends Parent {
//    public void abs(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}
