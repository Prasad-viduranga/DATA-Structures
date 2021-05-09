package ds;

import java.util.Arrays;

public class Queue {

    int arr[] = {};

    public void enqueue(int num) {
        int memArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < arr.length ) {
                memArr[i] = arr[i];
            } else {
                memArr[i] = num;
            }

        }
        arr = memArr;
    }

    public void dequeue() {


    }

    public void print() {
        System.out.println(Arrays.toString(arr));

    }

    public void clear() {


    }

    public int size() {

        return 0;
    }

    public int peek() {

        return 0;
    }

    public boolean contains() {

        return false;
    }

    public boolean empty() {

        return true;
    }


}
