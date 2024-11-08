package reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        System.out.printf("Сумма %s и %s = %s", a, b, a + b);
    }
    void subtraction(int a, int b) {
        System.out.printf("Разница %s и %s = %s", a, b, a - b);
    }
    void multiplication(int a, int b) {
        System.out.printf("Произведение %s и %s = %s", a, b, a * b);
    }
    void division(int a, int b) {
        System.out.printf("Частное %s и %s = %s", a, b, a / b);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader("C:\\Users\\denis\\IdeaProjects\\lessons\\src\\main\\resources\\calc.txt"))) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method [] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
