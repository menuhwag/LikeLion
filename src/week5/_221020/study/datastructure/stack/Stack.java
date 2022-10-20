package week5._221020.study.datastructure.stack;

import java.util.EmptyStackException;

public class Stack {
    private Integer[] arr;
    private int top;

    public Stack(int size) {
        this.arr = new Integer[size];
        this.top = 0;
    }

    public void push(int value) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException("배열이 꽉 참.");
        this.arr[top++] = value;
    }

    public Integer pop() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[--top];
    }

    public Integer peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[top - 1];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length;
    }

}
