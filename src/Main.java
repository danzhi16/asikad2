package src;

public class Main {
    public static void main(String[] args) {
        // Using MyArrayList
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("MyArrayList get(1): " + arrayList.get(1)); // 2

        // Using MyStack
        MyStack<String> stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        System.out.println("MyStack pop(): " + stack.pop()); // B

        // Using MyQueue
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("X");
        queue.enqueue("Y");
        System.out.println("MyQueue dequeue(): " + queue.dequeue()); // X

        // Using MyMinHeap
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(42);
        heap.insert(21);
        heap.insert(99);
        System.out.println("MyMinHeap getMin(): " + heap.getMin()); // 21
        System.out.println("MyMinHeap extractMin(): " + heap.extractMin()); // 21
        System.out.println("MyMinHeap getMin() after extract: " + heap.getMin()); // 42
    }
}
