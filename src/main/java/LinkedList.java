
@SuppressWarnings("ALL")
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

    public Node<T> delete(int location) {
        Node<T> toDelete = null;
        if (this.head != null) {
            if(location > 0) {
                this.tail = toDelete;
            }else{
                this.head = toDelete;
            }

        } else {
            throw new IllegalArgumentException();
        }
        return toDelete;
    }

    public int getIndex(T data) {
        Node<T> object = this.head;
        if (object != null) {
            if (object.data.equals(data)) {
                return 0;
            }
            return 1;
        }
        return  -1;
    }
}
