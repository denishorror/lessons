package generics;

public class ParamerizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Δενθρ");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i2 = info2.getValue();

        Info<Double> info3 = new Info<>(3.14);
        System.out.println(info3);
        Double i3 = info3.getValue();
    }

    static class Info <T extends Number> {
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
}
