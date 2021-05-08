import java.util.Arrays;

public class Stack {
    static int stackArray[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(7);
    }


    public void push(int num) {
        int stackArrayPushed[] = new int[stackArray.length+1];

        for (int i = 0; i < stackArrayPushed.length; i++) {
            System.out.println(i);
            if (i < stackArray.length) {
                stackArrayPushed[i] = stackArray[i];
            } else {
                stackArrayPushed[i] = num;
            }
        }
        System.out.println(Arrays.toString(stackArrayPushed));

    }

    public void pop() {

    }

    public boolean empty() {
        return true;
    }

    public void clear() {

    }

    public void print() {

    }

    public boolean constains(int num) {
        return true;
    }


}
