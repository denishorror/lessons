package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee"); // первый способ
//        Class employeeClass2 = Employee.class; // второй способ
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();// третий способ

        Field someField = employeeClass.getField("id");
        System.out.printf("Тип поля id: %s%n", someField.getType());
        System.out.println("---------------------");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.printf("Тип поля %s: %s%n", field.getName(), field.getType());
        }
        System.out.println("---------------------");

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.printf("Тип поля %s: %s%n", field.getName(), field.getType());
        }
        System.out.println("---------------------\n");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.printf("Возвращаем тип метода increaseSalary = %s, типы параметров = %s%n",
                someMethod1.getReturnType(), Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("---------------------");


        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.printf("Возвращаем тип метода setSalary = %s, типы параметров = %s%n",
                someMethod2.getReturnType(), Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("---------------------");

        // Получаем унаследованные методы и объявленные кроме private
        Method [] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.printf("Имя метода = %s, тип метода = %s, типы параметров = %s%n",
                    method.getName(), method.getReturnType(), Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------------");

        // Получаем  объявленные методы включая  private и @override
        Method [] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.printf("Имя метода = %s, тип метода = %s, типы параметров = %s%n",
                    method.getName(), method.getReturnType(), Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------------");

        // Получаем  объявленные методы включая @override и исключая private
        Method [] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if(Modifier.isPublic(method.getModifiers())) {
                System.out.printf("Имя метода = %s, тип метода = %s, типы параметров = %s%n",
                        method.getName(), method.getReturnType(), Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("---------------------");

        // Конструкторы
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.printf("\nКонструктор имеет %s параметров, их типы: %s",
                constructor1.getParameterCount(), Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("\n---------------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.printf("\nКонструктор имеет %s параметров, их типы: %s",
                constructor2.getParameterCount(), Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("\n---------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.printf("\nКонструктор %s имеет %s параметров, их типы: %s",
                    constructor.getName(),
                    constructor.getParameterCount(),
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
