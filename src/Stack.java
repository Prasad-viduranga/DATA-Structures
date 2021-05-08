import java.util.Arrays;

public class Stack {
    static int stackArray[] = {};

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(7);

        System.out.println(stack.empty());
        stack.print();
        stack.pop();
        stack.clear();
        stack.print();
        System.out.println(stack.empty());
    }


    public void push(int num) {
        int stackArrayPushed[] = new int[stackArray.length + 1];
        for (int i = 0; i < stackArrayPushed.length; i++) {

            if (i < stackArray.length) {
                stackArrayPushed[i] = stackArray[i];
            } else {
                stackArrayPushed[i] = num;
            }
        }
        stackArray = stackArrayPushed;
    }

    public void pop() {
        int stackArrayPoped[] = new int[stackArray.length - 1];
        for (int i = 0; i < stackArrayPoped.length; i++) {
            stackArrayPoped[i] = stackArray[i];
        }
        stackArray = stackArrayPoped;


    }

    public boolean empty() {
        if (stackArray.length > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void clear() {


    }

    public void print() {
        System.out.println(Arrays.toString(stackArray));

    }

    public boolean constains(int num) {
        return true;
    }


}
