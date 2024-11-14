package lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Привет"));
    }

    static void fed(J j) {
        System.out.println(j.cba());
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str) -> {
            System.out.println(i);
            return str.length() + i;
        });
        fed(() -> 18);
    }

    interface I {
        int abc(String i);
    }

    interface J {
        int cba();
    }
}
