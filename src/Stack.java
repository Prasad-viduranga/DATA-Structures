import java.util.Arrays;

public class Stack {
    static int stackArray[] = {};

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        Stack stack = new Stack();
        stack.push(7);

        System.out.println(stack.empty());
        System.out.println("--------------------------------");
        stack.print();
        System.out.println("--------------------------------");
        stack.pop();
        stack.print();
        System.out.println("--------------------------------");
        stack.push(1);
        stack.push(7);
        stack.print();
        stack.clear();
        stack.print();
        System.out.println(stack.empty());
        stack.push(3);
        stack.push(1);
        stack.push(7);
        stack.push(9);
        stack.print();
        System.out.println("--------------------------------");
        System.out.println(stack.contains(4));
        System.out.println(stack.contains(7));

        System.out.println("--------------------------------");
        System.out.println(stack.peek());
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

    public int peek() {
        return stackArray[stackArray.length - 1];
    }

    public void clear() {
        int emptyArray[] = {};
        stackArray = emptyArray;
    }

    public void print() {
        int getArray[]=new int[stackArray.length];
        for (int i=0;i<stackArray.length;i++){
            getArray[i]=stackArray[stackArray.length-i-1];
        }
        System.out.println(Arrays.toString(getArray));

    }

    public boolean contains(int num) {
        Boolean b = false;
        ;
        for (int i = 0; i < stackArray.length; i++) {

            if (num == (int) stackArray[i]) {
                b = true;
                break;

            } else {

                b = false;
            }

        }
        return b;
    }


}
