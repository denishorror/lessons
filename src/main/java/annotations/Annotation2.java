package annotations;

import java.lang.annotation.*;

public class Annotation2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiomiClass = Class.forName("annotations.Xiaomi");
        Annotation annotation1 = xiomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println(String.format("Annotation info from Xiaomi class: %s, %s", sm1.OS(), sm1.yearOfCompanyCreation()));

        Class iphoneClass = Class.forName("annotations.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println(String.format("Annotation info from iPhone class: %s, %s", sm2.OS(), sm2.yearOfCompanyCreation()));
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
