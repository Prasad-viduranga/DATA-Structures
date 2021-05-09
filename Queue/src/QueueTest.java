import ds.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
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
        queue.clear();
        queue.print();
        System.out.println("Size : " + queue.size());
        System.out.println("Last in : " + queue.peek());
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        System.out.println("Last in : " + queue.peek());
        System.out.println("Size : " + queue.size());
        System.out.println("Contains of : "+13+" is " + queue.contains(13));
        System.out.println("The Queue is empty, that is :" + queue.empty());
        queue.clear();
        System.out.println("The Queue is empty, that is :" + queue.empty());


    }
}
