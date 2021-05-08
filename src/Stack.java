import java.util.Arrays;

public class Stack {
    static int stackArray[] = {};

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(7);
        stack.pop();

        stack.print();
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
        //System.out.println(Arrays.toString(stackArrayPushed));
        stackArray = stackArrayPushed;
    }

    public void pop() {
/*        int stackArrayPushed[] = new int[stackArray.length+1];

        for (int i = 0; i < stackArrayPushed.length; i++) {

            if (i < stackArray.length) {
                stackArrayPushed[i] = stackArray[i];
            } else {
                stackArrayPushed[i] = num;
            }
        }
        System.out.println(Arrays.toString(stackArrayPushed));*/

    }

    public boolean empty() {
        //if (stackArray)
        return true;
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
