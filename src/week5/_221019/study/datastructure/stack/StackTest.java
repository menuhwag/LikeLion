package week5._221019.study.datastructure.stack;

import java.util.Arrays;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        System.out.println(Arrays.toString(stack.getArray()));
        System.out.printf("Stack is Empty? %s\n", stack.isEmpty());
        System.out.printf("요소 추가 : %d\n", 1);
        stack.push(1);
        System.out.println(Arrays.toString(stack.getArray()));
        System.out.printf("Is Stack Empty? %s\n", stack.isEmpty());
        System.out.printf("마지막 값 : %d\n", stack.peek());

        System.out.println(Arrays.toString(stack.getArray()));
        System.out.printf("요소 추가 : %d\n", 2);
        stack.push(2);
        System.out.printf("요소 추가 : %d\n", 3);
        stack.push(3);
        System.out.println(Arrays.toString(stack.getArray()));

        System.out.printf("팝 : %d\n", stack.pop());
        System.out.println(Arrays.toString(stack.getArray()));

        System.out.printf("요소 추가 : %d\n", 3);
        stack.push(3);
        System.out.printf("요소 추가 : %d\n", 4);
        stack.push(4);
        System.out.println(Arrays.toString(stack.getArray()));
        System.out.printf("Is Stack Full? %s\n", stack.isFull());

        System.out.printf("요소 추가 : %d\n", 5);
        stack.push(5); //stackoverflow
    }
}
