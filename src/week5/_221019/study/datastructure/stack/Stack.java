package week5._221019.study.datastructure.stack;


public class Stack {
    private int[] array;
    private int top;
    private int size;

    public Stack(int size) {
        this.array = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int element) {
        if (isFull()) throw new StackOverflowError();
        this.array[++top] = element;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("빈 스택");
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("빈 스택");
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int[] getArray() {
        return array;
    }
}
