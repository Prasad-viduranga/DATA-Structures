package ds;

public class Queue {

    int arr[] = {};

    public void enqueue(int num) {
        int memArr[] = {};
        for (int i = 0; i < arr.length + 1; i++) {
            if(i<arr.length-1){
                memArr[i]=arr[i];
            }else{
                memArr[i]=num;
            }

        }

    }

    public void dequeue() {


    }

    public void print() {


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
