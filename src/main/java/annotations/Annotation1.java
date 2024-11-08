package annotations;

import lombok.AllArgsConstructor;

public class Annotation1 {
    public static void main(String[] args) {
        Parent p = new Child("Δενθρ");
        p.showInfo();
    }
}

@AllArgsConstructor
class Parent {
    String name;


    void showInfo() {
        System.out.println(String.format("It's Parent class. Name = %s", name));
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println(String.format("It's Child class. Name = %s", name));
    }
}
