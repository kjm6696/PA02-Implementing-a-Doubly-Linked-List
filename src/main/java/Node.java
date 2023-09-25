public class Node<T> {
    T data;
    Node<T> head;
    Node<T> tail;
    public Node(T data) {
        this.data = data;
        this.head = null;
        this.tail = null;
    }
}
