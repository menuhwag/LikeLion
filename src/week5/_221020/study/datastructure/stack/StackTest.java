package week5._221020.study.datastructure.stack;


public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        System.out.printf("요소 추가 : %d\n", 1);
        stack.push(1);

        System.out.printf("요소 추가 : %d\n", 2);
        stack.push(2);
        System.out.printf("요소 추가 : %d\n", 3);
        stack.push(3);

        System.out.printf("팝 : %d\n", stack.pop());

        System.out.printf("요소 추가 : %d\n", 3);
        stack.push(3);
        System.out.printf("요소 추가 : %d\n", 4);
        stack.push(4);

        System.out.printf("요소 추가 : %d\n", 5);
        stack.push(5); //stackoverflow
    }
}
