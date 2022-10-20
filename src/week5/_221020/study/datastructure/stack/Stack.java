package week5._221020.study.datastructure.stack;

public class Stack {
    private Integer[] arr;
    private int top = -1;

    public Stack(int size) {
        this.arr = new Integer[size];
        this.top = 0;
    }

    public void push(int value) {
        this.arr[top++] = value;
    }

    public Integer pop() {
        return arr[--top];
    }



}
