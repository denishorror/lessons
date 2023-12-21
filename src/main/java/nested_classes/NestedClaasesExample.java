package nested_classes;

public class NestedClaasesExample {
    static class A {} // статический вложенный класс
    class B {} // вложенный класс
    void method() {
        class С {} // локальный вложенный класс
    }
}
