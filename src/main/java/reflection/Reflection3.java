package reflection;

import java.lang.reflect.Field;

public class Reflection3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee2 employee = new Employee2(5, "Δενθρ", "IT");
        Class employeeClass = employee.getClass();

        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = field.getDouble(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500);
        System.out.println(employee);
    }
}
