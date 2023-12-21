package nested_classes.static_nested_class;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine = new Engine(256);
        System.out.println(engine.horsePower);
    }

    interface Interface1 {}

    public static class Engine {
        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        private int horsePower;
        static int countOfObjects;



        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car ñar = new Car("red", 4, engine);
        System.out.println(ñar);
    }
}

class Z extends Car.Engine {
    Z() {
        super(200);
    }
}
