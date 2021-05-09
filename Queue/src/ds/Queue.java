package ds;

import java.util.Arrays;

public class Queue {

    int queueArr[] = {};

    public void enqueue(int num) {
        int memArr[] = new int[queueArr.length + 1];
        for (int i = 0; i < queueArr.length + 1; i++) {
            if (i < queueArr.length) {
                memArr[i] = queueArr[i];
            } else {
                memArr[i] = num;
            }
        }
        queueArr = memArr;
    }

    public void dequeue() {
        int memArr[] = new int[queueArr.length - 1];
        for (int i = 0; i < queueArr.length - 1; i++) {

            memArr[i] = queueArr[i + 1];
        }
        queueArr = memArr;
    }

    public void print() {
        System.out.println(Arrays.toString(queueArr));

    }

    public void clear() {
        int memArr[] = {};
        queueArr = memArr;

    }

    public int size() {

        return queueArr.length;
    }

    public int peek() {
        int lastIn = 0;
        if (queueArr.length > 0) {
            lastIn = queueArr[queueArr.length - 1];
        }
        return lastIn;
    }

    public boolean contains(int num) {
        Boolean b = false;
        for (int i = 0; i < queueArr.length; i++) {
            if (num == queueArr[i]) {
                b = true;
            }
        }
        return b;
    }

    public boolean empty() {
        if (queueArr.length > 0) {
            return false;
        } else {
            return true;
        }
    }


}
