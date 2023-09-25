
public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node<T> append(T data) {
        Node<T> toAppend = new Node<>(data);

        if (this.head == null) {
            this.head = toAppend;
            this.tail = toAppend;
        }
        return toAppend;
    }

    public Node<T> insert(int location, T data) {
        Node<T> toInsert = new Node<>(data);

        if (this.head != null) {
            if (location > 0 ) {
                this.tail = toInsert;
            }else{
                this.head = toInsert;
            }
        }else{
            throw new IllegalArgumentException();
        }
        return toInsert;
    }

}
