import ds.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
