package src;

/**
 * A simple queue implementation using a linked list.
 *
 * @param <T> the type of elements in the queue
 */
public class MyQueue<T> {
    private final MyList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {
        list.addLast(item); // Add item to the end
    }

    public T dequeue() {
        T first = list.getFirst(); // Get the first item
        list.removeFirst(); // Remove the first item
        return first;
    }

    public T peek() {
        return list.getFirst(); // View the first item
    }

    public boolean isEmpty() {
        return list.size() == 0; // Check if the queue is empty
    }
}