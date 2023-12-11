package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Денис");
        stack.push("Миша");
        stack.push("Олег");
        stack.push("Катя");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("------------------");
        while (!stack.empty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
