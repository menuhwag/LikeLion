package week5._221021.homework.codeup._3129;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.next();

        Stack<Character> stack = new Stack<>();

        if (brackets.charAt(0) == ')') {
            System.out.println("bad");
            return;
        }

        stack.push(brackets.charAt(0));

        for (int i = 1; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                try {
                    stack.pop();
                } catch (EmptyStackException e) {
                    System.out.println("bad");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty() ? "good" : "bad");
    }
}
