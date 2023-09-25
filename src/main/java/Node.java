public class Node<T> {
    T data;
    Node<T> head;
    Node<T> tail;

    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.head = null;
        this.tail = null;
    }
}
